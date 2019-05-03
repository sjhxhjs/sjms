package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    //自己的业务逻辑
    public void selfMethod2() {

    }
    //依赖其他同事，共同完成的业务逻辑
    public void depMethod2() {
        super.mediator.doSomething2();
    }
}
