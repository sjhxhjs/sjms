package main;

/**
 * @auther: abird
 * @date: 2019/05/07
 * @Description:
 */
public class ConcreteAbstraction extends Abstraction {
    public ConcreteAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void request() {
        super.request();
    }
}
