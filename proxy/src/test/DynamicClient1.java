package test;

import main.dynamicproxy.DynamicProxy;
import main.dynamicproxy.Subject;
import main.dynamicproxy.SubjectDynamicProxy;
import main.dynamicproxy.SubjectImpl;

/**
 * @auther: abird
 * @Date: 19-5-4 00:39
 * @Description:
 */
public class DynamicClient1 {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();

        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("优化后的动态代理");
    }
}
