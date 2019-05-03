package main.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Auther: abird
 * @Date: 19-5-4 00:17
 * @Description: 动态代理类，泛型类，通用性强，根据传入的T的类型可以返回具体类型
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interFaces, InvocationHandler h) {

        //执行被代理类的方法，实际是交给invocationhandler执行具体类的方法
        //这里只是一个空壳子
        return (T) Proxy.newProxyInstance(loader, interFaces, h);
    }
}
