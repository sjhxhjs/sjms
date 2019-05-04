package test;

import main.ConcreteObserver;
import main.ConcreteSubject;
import main.Observer;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        //创建一个观察者
        Observer observer = new ConcreteObserver();
        //添加观察者
        subject.add(observer);
        subject.doSomething();
    }
}
