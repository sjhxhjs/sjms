package main.dynamicproxy;

/**
 * @Auther: abird
 * @Date: 19-5-4 00:08
 * @Description:抽象主题角色，规定了被代理类的规范
 */
public interface Subject {
    public void doSomething(String string);
}
