package test;

import main.Adapter;
import main.ConcreteTarget;
import main.Target;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //通过适配器，调用原来无法调用的方法
        Target target = new Adapter();
        target.request();
    }
}
