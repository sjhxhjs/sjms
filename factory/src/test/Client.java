package test;

import main.ConcreteCreater;
import main.ConcreteProduct1;
import main.Creater;
import main.Product;

/**
 * @Auther: abird
 * @Date: 19-5-1 13:26
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Creater creater = new ConcreteCreater();
        Product product = creater.createProduct(ConcreteProduct1.class);

        //调用concreteProduct1的method2方法
        product.method2();
    }
}
