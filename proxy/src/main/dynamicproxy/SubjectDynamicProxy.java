package main.dynamicproxy;

import java.lang.reflect.InvocationHandler;

/**
 * @auther: abird
 * @Date: 19-5-4 00:31
 * @Description: 具体业务代理类，只用DynamicProxy作为动态代理时
 *                  客户端调用时，需要声明具体的handler类，不符合迪米特法则
 *                  创建具体业务代理类继承动态代理类，封装具体的handler类
 *                  客户端调用时只需要知道具体代理类和被代理对象即可
 */
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader loader = subject.getClass().getClassLoader();
        InvocationHandler handler = new MyInvocationHandler(subject);
        Class[] interfaces = subject.getClass().getInterfaces();

        return newProxyInstance(loader, interfaces, handler);
    }
}
