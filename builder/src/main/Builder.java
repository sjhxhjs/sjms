package main;

/**
 * @Auther: abird
 * @Date: 19-5-3 23:38
 * @Description: 抽象建造者
 */
public abstract class Builder {
    //抽象方法，设置要建造的对象的属性信息
    protected abstract void setPart();

    //建造对象
    protected abstract Product buildProduct();
}
