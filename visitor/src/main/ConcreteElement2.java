package main;

/**
 * @auther: abird
 * @date: 2019/05/05
 * @Description:
 */
public class ConcreteElement2 extends Element {
    @Override
    public void doSomething() {

    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
