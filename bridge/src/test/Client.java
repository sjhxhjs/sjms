package test;

import main.Abstraction;
import main.ConcreteAbstraction;
import main.ConcreteImplementor;
import main.Implementor;

/**
 * @auther: abird
 * @date: 2019/05/07
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new ConcreteAbstraction(implementor);

        abstraction.request();
    }
}
