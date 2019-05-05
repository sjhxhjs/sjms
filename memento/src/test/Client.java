package test;

import main.Caretaker;
import main.Originator;

/**
 * @auther: abird
 * @date: 2019/05/05
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //定义初始发起人
        Originator originator = new Originator();
        //定义备忘录管理员
        Caretaker caretaker = new Caretaker();

        //创建一个备忘录,备忘录由源角色创建，委托给备忘录管理员管理
        caretaker.setMemento(originator.createMemento());
        //恢复备忘录
        originator.restoreMemento(caretaker.getMemento());
    }
}
