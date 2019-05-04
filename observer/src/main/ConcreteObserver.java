package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:具体观察者
 */
public class ConcreteObserver extends Observer {
    @Override
    public void update() {
        System.out.println("具体观察者收到消息，进行处理");
    }
}
