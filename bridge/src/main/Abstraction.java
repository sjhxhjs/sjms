package main;

/**
 * @auther: abird
 * @date: 2019/05/07
 * @Description:抽象化角色,定义角色行为，保存实现化角色的引用
 * 用于具体实现角色行为
 */
public abstract class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void request() {
        this.implementor.doSomething();
        this.implementor.doAnything();
    }
}
