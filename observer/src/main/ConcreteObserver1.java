package main;

import java.util.Observable;
import java.util.Observer;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观察者ConcreteObserver1收到消息");
    }
}
