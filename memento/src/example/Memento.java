package example;

import java.util.HashMap;

/**
 * @auther: abird
 * @date: 2019/05/05
 * @Description: 备忘录角色
 */
public class Memento {
    //备忘的状态
    private HashMap<String, Object> stateMap;


    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    //建立备份
    public Memento(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
