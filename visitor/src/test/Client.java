package test;

import main.ConcreteElement1;
import main.Element;
import main.IVisitor;
import main.Visitor;

/**
 * @auther: abird
 * @date: 2019/05/05
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Element e1 = new ConcreteElement1();
        IVisitor visitor = new Visitor();

        e1.accept(visitor);
    }
}
