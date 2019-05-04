package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:源角色，希望被转换接口的角色，经过适配器包装，可供其他类调用
 */
public class Adaptee {
    public void doSomething() {
        System.out.println("源角色的方法");
    }
}
