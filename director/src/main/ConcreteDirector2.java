package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class ConcreteDirector2 extends Director {
    public ConcreteDirector2(Component component) {
        super(component);
    }

    //装饰类2的装饰方法
    private void method2() {
        System.out.println("装饰类2的装饰方法");
    }
    @Override
    public void operate() {
        method2();
        super.operate();
    }
}
