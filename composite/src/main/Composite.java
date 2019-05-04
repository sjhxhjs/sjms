package main;

import java.util.ArrayList;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 树枝构件
 */
public class Composite extends Componet {
    //构件容器
    private ArrayList<Componet> componetArrayList = new ArrayList<>();

    //添加构件
    public void add(Componet componet) {
        componetArrayList.add(componet);
    }

    //移除构件
    public void remove(Componet componet) {
        componetArrayList.remove(componet);
    }

    //获取所有构件
    public ArrayList<Componet> getAll() {
        return componetArrayList;
    }
}
