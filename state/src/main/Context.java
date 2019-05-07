package main;

/**
 * @auther: abird
 * @date: 2019/05/07
 * @Description:环境角色，实现状态的切换,提供执行方法的对外接口
 * 具体执行委托给具体状态角色
 */
public class Context {
    //定义状态
    protected static final State STATE1 = new ConcreteState1();
    protected static final State STATE2 = new ConcreteState2();

    //当前状态
    private State CurrentState;

    public State getCurrentState() {
        return CurrentState;
    }

    public void setCurrentState(State currentState) {
        CurrentState = currentState;
        this.CurrentState.setContext(this);
    }

    public void handle1() {
        this.CurrentState.handle1();
    }

    public void handle2() {
        this.CurrentState.handle2();
    }
}
