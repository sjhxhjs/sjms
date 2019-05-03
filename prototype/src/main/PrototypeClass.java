package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 原型模式
 */
public class PrototypeClass implements Cloneable {
    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
