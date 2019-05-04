package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:适配器类，继承要转换的角色类，通过接口封装调用父类方法
 * 实现通过原有类型，方法的调用执行父类的方法
 */
public class Adapter extends Adaptee implements Target {
    //封装父类的方法，实现适配模式
    @Override
    public void request() {
        super.doSomething();
    }
}
