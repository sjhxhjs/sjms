package test;

import main.Command;
import main.ConcreteCommand1;
import main.ConcreteCommand2;
import main.Invoker;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //生明具体命令
        Command command1 = new ConcreteCommand1();
        Command command2 = new ConcreteCommand2();

        //声明命令接收者，接收具体命令并执行
        Invoker invoker = new Invoker(command1);
        invoker.action();

        Invoker invoker1 = new Invoker(command2);
        invoker1.action();
    }
}
