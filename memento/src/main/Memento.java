package main;

/**
 * @auther: abird
 * @date: 2019/05/05
 * @Description: 备忘录角色
 */
public class Memento {
    //被备忘的角色的内部状态
    private String state = "";

    public Memento(String _state) {
        this.state = _state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
