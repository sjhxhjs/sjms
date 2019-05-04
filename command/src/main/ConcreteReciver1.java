package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 具体命令执行者，执行具体的业务逻辑
 */
public class ConcreteReciver1 extends Reciver {
    @Override
    public void doSomething() {
        System.out.println("命令执行者1");
    }
}
