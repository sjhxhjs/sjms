package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 具体同事类
 */
public class ConcreteColleague1 extends Colleague {
    //通过构造函数传递中介者
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    //自己的业务逻辑
    public void selfMethod1() {

    }

    //依赖其他同事，共同完成的业务逻辑
    public void depMethod1() {
        super.mediator.doSomething1();
    }
}
