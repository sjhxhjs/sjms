package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:具体责任类，实现自己的处理逻辑
 */
public class ConcreteHandler2 extends Handler {

    public ConcreteHandler2(String level) {
        super(level);
    }

    @Override
    protected Response echo(String flag) {
        return new Response("2","责任类2");
    }
}
