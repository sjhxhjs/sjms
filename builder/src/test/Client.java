package test;

import main.Director;
import main.Product;

/**
 * @Auther: abird
 * @Date: 19-5-3 23:47
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.getProduct();

        product.doSomething();
    }
}
