package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 深拷贝
 */
public class DeepClone implements Cloneable {
    private Product product = new Product();
    private int age;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public DeepClone clone() throws CloneNotSupportedException {
        DeepClone deepClone = null;
        deepClone = (DeepClone) super.clone();
        product = product.clone();
        return deepClone;
    }

    @Override
    public String toString() {
        return "DeepClone{" +
                "product=" + product +
                ", age=" + age +
                '}';
    }
}
