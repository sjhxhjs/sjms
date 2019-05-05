package main;

/**
 * @auther: abird
 * @date: 2019/05/05
 * @Description:
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(ConcreteElement1 element1) {
        element1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 element2) {
        element2.doSomething();
    }
}
