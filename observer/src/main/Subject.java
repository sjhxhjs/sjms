package main;

import java.util.Vector;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 被观察者
 */
public abstract class Subject {
    //观察者组
    private Vector<Observer> observerVector = new Vector<Observer>();

    //增加观察者
    public void add(Observer observer) {
        observerVector.add(observer);
    }

    //通知所有观察者
    public void notifyObservers() {
        for (Observer o : observerVector) {
            o.update();
        }
    }
}
