package test;

import main.*;

/**
 * @Auther: abird
 * @Date: 19-5-2 15:19
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //定义两个工厂
        AbstractCreater creater1 = new Creater1();
        AbstractCreater creater2 = new Creater2();

        //生产产品族A,产品等级1的产品
        AbstractProductA a1 = creater1.createProductA();
        //生产产品族A,产品等级2的产品
        AbstractProductA a2 = creater2.createProductA();

        //生产产品族B,产品等级1的产品
        AbstractProductB b1 = creater1.createProductB();
        //生产产品族B,产品等级2的产品
        AbstractProductB b2 = creater2.createProductB();
    }
}
