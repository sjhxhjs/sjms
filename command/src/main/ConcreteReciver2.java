package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 具体命令执行者2，执行具体业务逻辑
 */
public class ConcreteReciver2 extends Reciver {
    @Override
    public void doSomething() {
        System.out.println("具体命令执行者2");
    }
}
