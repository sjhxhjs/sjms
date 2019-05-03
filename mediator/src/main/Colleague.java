package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 抽象同事类
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
