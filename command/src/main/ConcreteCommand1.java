package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 具体命令，每个命令有自己的具体执行者类
 */
public class ConcreteCommand1 extends Command {
    public ConcreteCommand1() {
        super(new ConcreteReciver1());
    }

    /*@Override
    public void excute() {
        super.reciver.doSomething();
    }*/
}
