package main;

/**
 * @auther: abird
 * @date: 2019/05/05
 * @Description:
 */
public class ConcreteElement1 extends Element {
    @Override
    public void doSomething() {

    }

    /**
     *
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
