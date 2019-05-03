package test;

import main.PrototypeClass;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        PrototypeClass prototypeClass = new PrototypeClass();
        PrototypeClass prototypeClass1 = prototypeClass.clone();
    }
}
