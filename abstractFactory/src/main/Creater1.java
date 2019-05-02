package main;

/**
 * @Auther: abird
 * @Date: 19-5-2 15:17
 * @Description:
 */
public class Creater1 extends AbstractCreater {
    @Override
    public AbstractProductA createProductA() {
        return new Product1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
