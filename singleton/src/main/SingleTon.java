package main;

/**
 * 单例模式
 */
public class SingleTon {
    private static final SingleTon singleton = new SingleTon();
    private SingleTon() {

    }

    public static SingleTon getSingleton() {
        return singleton;
    }
}
