package main;

/**
 * @auther: abird
 * @date: 2019/05/05
 * @Description:抽象元素
 */
public abstract class Element {
    //业务逻辑
    public abstract void doSomething();

    //允许谁来访问
    public abstract void accept(IVisitor visitor);
}
