package main;

/**
 * @Auther: abird
 * @Date: 19-5-3 23:42
 * @Description: 具体建造者，建造具体产品
 */
public class ConcreteBuilder extends Builder{
    private Product product = null;

    @Override
    protected void setPart() {
        //设置产品属性
        //product.setXXX();
    }

    @Override
    protected Product buildProduct() {
        this.setPart();
        return product;
    }
}