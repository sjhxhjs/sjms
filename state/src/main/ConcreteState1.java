package main;

/**
 * @auther: abird
 * @date: 2019/05/07
 * @Description:具体状态角色
 */
public class ConcreteState1 extends State {
    @Override
    public void handle1() {

    }

    @Override
    public void handle2() {
        //设置状态为state2
        super.context.setCurrentState(Context.STATE2);
        //执行state2的方法
        super.context.handle2();
    }
}
