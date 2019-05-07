package main;

import javax.naming.Context;

/**
 * @auther: abird
 * @date: 2019/05/07
 * @Description:抽象解释器，定义抽象的解释方法
 */
public abstract class Expression {
    public abstract Object interpreter(Context ctx);
}
