package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 抽象命令类，封装命令，调用具体命令执行者执行业务逻辑
 */
public abstract class Command {
    //封装命令执行者角色
    protected final Reciver reciver;

    public Command(Reciver reciver) {
        this.reciver = reciver;
    }

    //执行命令
    public void excute() {
        reciver.doSomething();
    }
}
