package main;

/**
 * @Auther: abird
 * @Date: 19-5-1 13:21
 * @Description: 具体工厂
 */
public class ConcreteCreater extends Creater {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T) product;
    }
}
