package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 抽象处理类，责任链的规范
 */
public abstract class Handler {
    //控制责任链执行的状态值
    private final String level;

    //下一个责任处理类
    private Handler nexthandler;

    public Handler(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public Handler getNexthandler() {
        return nexthandler;
    }

    public void setNexthandler(Handler nexthandler) {
        this.nexthandler = nexthandler;
    }

    public final Response handleMessage(String flag) {
        Response response = null;
        if (this.getLevel().equals(flag)) {
            response = this.echo(flag);
        } else {
            if (nexthandler != null) {
                response = nexthandler.handleMessage(flag);
            } else {
                System.out.println("没有适合的责任处理类");
                return new Response("0","没有适合的责任处理类");
            }
        }
        return response;
    }

    //责任类应实现的具体业务逻辑
    protected abstract Response echo(String flag);
}
