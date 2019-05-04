package test;

import main.ConcreteObserver1;
import main.ConcreteSubject1;

import java.util.Observer;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class Client1 {
    public static void main(String[] args) {
        //创建被观察者
        ConcreteSubject1 subject1 = new ConcreteSubject1();
        //创建观察者
        Observer observer = new ConcreteObserver1();
        subject1.addObserver(observer);
        subject1.doSomething();
    }
}
