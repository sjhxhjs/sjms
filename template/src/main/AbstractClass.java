package main;

/**
 * @Auther: abird
 * @Date: 19-5-2 15:28
 * @Description: 模板方法模式，抽象模板类
 */
public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomething();

    //基本方法
    protected abstract void doAnything();

    //模板方法
    public void templateMethod() {
        this.doSomething();
        this.doAnything();
    }
}
