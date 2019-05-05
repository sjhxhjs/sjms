package main;

/**
 * @auther: abird
 * @date: 2019/05/05
 * @Description:抽象访问者
 */
public interface IVisitor {
    //可以访问那些元素
    /**
     *巧妙的运用重载原理，传过来的element不同，调用的visit方法不同，从而访问不同的元素
     */
    public  void visit(ConcreteElement1 element1);
    public  void visit(ConcreteElement2 element2);
}
