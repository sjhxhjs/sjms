package test;

import main.*;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //具体业务执行类
        Component component = new ConcreteComponent();
        //经过装饰的业务执行类
        component = new ConcreteDirector1(component);
        component = new ConcreteDirector2(component);
        component.operate();
    }
}
