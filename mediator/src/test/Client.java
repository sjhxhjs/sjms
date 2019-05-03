package test;

import main.*;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);
        mediator.setC1(c1);
        mediator.setC2(c2);
        mediator.doSomething1();
    }
}
