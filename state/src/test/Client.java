package test;

import main.ConcreteState1;
import main.Context;

/**
 * @auther: abird
 * @date: 2019/05/07
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //设置环境角色
        Context context = new Context();
        //设置状态
        context.setCurrentState(new ConcreteState1());

        //执行方法
        context.handle1();
        context.handle2();
    }
}
