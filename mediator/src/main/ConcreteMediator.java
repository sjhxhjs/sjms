package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 具体中介者
 */
public class ConcreteMediator extends Mediator {
    /**
     * 同事类相互配合才能完成的方法
     */
    @Override
    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
    /**
     * 同事类相互配合才能完成的方法
     */
    @Override
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
