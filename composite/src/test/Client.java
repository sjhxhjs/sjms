package test;

import main.Componet;
import main.Composite;
import main.Leaf;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建根节点
        Composite root = new Composite();
        root.doSomething();

        //创建树枝节点
        Composite branch = new Composite();
        //创建叶子节点
        Leaf leaf = new Leaf();

        //建立整体树形结构
        branch.add(leaf);
        root.add(branch);

        //递归遍历树
        display(root);
    }

    public static void display(Composite root) {
        for (Componet c : root.getAll()) {
            if (c instanceof Leaf) {
                c.doSomething();
            } else {
                display((Composite) c);
            }
        }
    }
}
