package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 抽象策略类，因为策略模式是封装算法，所以采用接口定义规范
 */
public interface Strategy {
    //策略算法
    public void doSomething();
}
