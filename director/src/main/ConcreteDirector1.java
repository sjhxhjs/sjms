package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 具体装饰类
 */
public class ConcreteDirector1 extends Director {
    public ConcreteDirector1(Component component) {
        super(component);
    }

    //装饰方法
    private void method1() {
        System.out.println("装饰类1的装饰方法");
    }

    //重写父类的执行业务逻辑的方法，进行装饰
    @Override
    public void operate() {
        method1();
        super.operate();
    }
}
