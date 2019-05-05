package main;

/**
 * @auther: abird
 * @date: 2019/05/05
 * @Description: 发起人角色，（需要被备忘的角色）
 */
public class Originator {
    //内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建备忘录角色
    public Memento createMemento() {
        return new Memento(state);
    }

    //通过备忘录角色恢复一个角色的状态
    public void restoreMemento(Memento _memento) {
        this.setState(_memento.getState());
    }
}
