package main;

/**
 * @Auther: abird
 * @Date: 19-5-1 13:17
 * @Description: 抽象工厂
 */
public abstract class Creater {
    /**
     * 泛型方法，返回类型根据传入参数类型决定
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
