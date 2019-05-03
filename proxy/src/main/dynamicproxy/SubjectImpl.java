package main.dynamicproxy;

/**
 * @Auther: abird
 * @Date: 19-5-4 00:09
 * @Description:具体主题角色，被代理类
 */
public class SubjectImpl implements Subject {
    @Override
    public void doSomething(String string) {
        System.out.println("do something!--------->"+string);
    }
}
