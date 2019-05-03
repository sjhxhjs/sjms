package test;

import main.DeepClone;
import main.Product;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class DeepClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepClone deepClone = new DeepClone();
        deepClone.setAge(2);
        Product product = new Product();
        product.setName("test");
        deepClone.setProduct(product);
        DeepClone deepClone1 = deepClone.clone();

        System.out.println("deepClone = "+deepClone);
        System.out.println("deepClone1 = "+deepClone1);
        deepClone1.getProduct().setName("test1");
        deepClone1.setAge(3);
        System.out.println("------------------------");
        System.out.println("deepClone = "+deepClone);
        System.out.println("deepClone1 = "+deepClone1);

    }
}
