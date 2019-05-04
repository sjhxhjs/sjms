package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:封装策略算法
 */
public class Context {
    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //执行策略
    public void doSomething() {
        strategy.doSomething();
    }
}
