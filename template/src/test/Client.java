package test;

import main.AbstractClass;
import main.ConcreteClass1;
import main.ConcreteClass2;

/**
 * @Auther: abird
 * @Date: 19-5-2 15:33
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();

        AbstractClass class2 = new ConcreteClass2();

        //调用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
