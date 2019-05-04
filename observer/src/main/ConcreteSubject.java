package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 具体被观察者
 */
public class ConcreteSubject extends Subject {
    public void doSomething() {
        //执行业务逻辑之后通知观察者
        System.out.println("被观察者执行业务逻辑");
        super.notifyObservers();
    }
}
