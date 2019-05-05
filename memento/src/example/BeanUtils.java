package example;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @auther: abird
 * @date: 2019/05/05
 * @Description: 工具类，遍历并备份bean的值
 */
public class BeanUtils {
    //把bean所有属性及值放入map
    public static HashMap<String, Object> backupProp(Object bean) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            //获得bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            //获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();

            //遍历所有属性
            for (PropertyDescriptor des : descriptors) {
                //属性名称
                String fieldName = des.getName();
                //读取属性的方法
                Method getter = des.getReadMethod();

                //读取属性值
                Object fieldValue = getter.invoke(bean, new Object[]{});
                if (!fieldName.equalsIgnoreCase("class")) {
                    result.put(fieldName, fieldValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    public static void restoreProp(Object bean, HashMap<String, Object> propMap) {
        try {
            //获得bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            //获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();

            //遍历所有属性
            for (PropertyDescriptor des : descriptors) {
                //属性名称
                String fieldName = des.getName();
                if (propMap.containsKey(fieldName)) {
                    //读取属性的方法
                    Method setter = des.getWriteMethod();

                    //读取属性值
                    Object fieldValue = setter.invoke(bean, new Object[]{propMap.get(fieldName)});
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
