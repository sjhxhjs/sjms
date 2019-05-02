package main;

/**
 * @Auther: abird
 * @Date: 19-5-2 15:18
 * @Description:
 */
public class Creater2 extends AbstractCreater {
    @Override
    public AbstractProductA createProductA() {
        return new Product2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
