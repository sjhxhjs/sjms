package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 具体策略类，提供策略算法
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("策略算法1");
    }
}
