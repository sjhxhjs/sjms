package main;

/**
 * @auther: abird
 * @date: 2019/05/07
 * @Description:具体状态角色
 */
public class ConcreteState2 extends State {
    @Override
    public void handle1() {
        //设置当前状态为state1
        super.context.setCurrentState(Context.STATE1);
        //执行state1状态的方法
        super.context.handle1();
    }

    @Override
    public void handle2() {

    }
}
