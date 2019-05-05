package example;

/**
 * @auther: abird
 * @date: 2019/05/05
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建源角色
        Originator originator = new Originator();
        //创建备忘录管理员
        Caretaker caretaker = new Caretaker();

        //初始化源角色
        originator.setState1("1");
        originator.setState2("2");
        originator.setState3("3");
        //创建备忘录，交给备忘录管理员管理
        caretaker.setMemento(originator.creteMemento());
        //修改源角色状态
        originator.setState1("11");
        originator.setState2("22");
        originator.setState3("33");

        //恢复
        originator.restoreMemento(caretaker.getMemento());
    }
}
