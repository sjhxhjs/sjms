package main;

/**
 * @auther: abird
 * @date: 2019/05/07
 * @Description:状态模式,抽象状态角色,负责对象状态的定义
 * 封装环境角色，实现状态切换
 */
public abstract class State {
    //环境角色
    protected Context context;
    //设置环境角色

    public void setContext(Context context) {
        this.context = context;
    }

    //定义行为
    public abstract void handle1();

    public abstract void handle2();
}
