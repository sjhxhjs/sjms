package test;

import main.dynamicproxy.DynamicProxy;
import main.dynamicproxy.MyInvocationHandler;
import main.dynamicproxy.Subject;
import main.dynamicproxy.SubjectImpl;

import java.lang.reflect.InvocationHandler;

/**
 * @Auther: abird
 * @Date: 19-5-4 00:24
 * @Description:
 */
public class DynamicClient {
    public static void main(String[] args) {
        //定义被代理类
        Subject subject = new SubjectImpl();
        //定义执行被代理类方法的handler
        InvocationHandler handler = new MyInvocationHandler(subject);

        //创建一个代理类
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), handler);
        //由代理类执行被代理类的方法
        proxy.doSomething("动态代理类测试");
    }
}
