package main;

/**
 * @Auther: abird
 * @Date: 19-5-3 23:44
 * @Description: 导演类，调用建造者生产对象，（符合迪米特法则，只和朋友类交流，
 *                  对其他类知道的最少）
 */
public class Director {
    Builder builder = new ConcreteBuilder();

    /**
     * 获取产品
     * @return
     */
    public Product getProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
