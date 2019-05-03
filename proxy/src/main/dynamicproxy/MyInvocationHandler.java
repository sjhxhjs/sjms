package main.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: abird
 * @Date: 19-5-4 00:11
 * @Description:动态代理需要实现InvocationHandler类，
 * 根据反射，调用被代理类的方法
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理对象
    private Object target = null;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    //执行被代理类的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
