package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 命令接收者类，接受命令，执行命令
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    //执行命令
    public void action() {
        command.excute();
    }
}
