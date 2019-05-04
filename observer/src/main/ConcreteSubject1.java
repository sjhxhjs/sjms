package main;

import java.util.Observable;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class ConcreteSubject1 extends Observable implements Subject1 {
    @Override
    public void doSomething() {
        System.out.println("被观察者ConcreteSubject1执行业务逻辑");
        super.setChanged();
        super.notifyObservers();
    }
}
