package test;

import main.ConcreteStrategy1;
import main.Context;
import main.Strategy;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        //声明具体策略
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        //执行策略
        context.doSomething();
    }
}
