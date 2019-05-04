package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:具体责任类，实现自己的处理逻辑
 */
public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1(String level) {
        super(level);
    }

    //自己的处理逻辑
    @Override
    protected Response echo(String flag) {
        return new Response("1","责任类1");
    }
}
