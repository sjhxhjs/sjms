package main;

/**
 * @Auther: abird
 * @Date: 19-5-2 15:04
 * @Description:抽象工厂,有几个产品族，工厂中就有几个
 * 生产方法，有几个产品等级就有几个工厂
 * 同一个工厂中生产同一个等级的产品，但是同一个等级的产品
 * 分别属于不同的产品族
 *
 * 换句话说，产品族属于一个产品等级
 */
public abstract class AbstractCreater {
    //有A1，A2两个产品族,所以需要两个创建方法
    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
