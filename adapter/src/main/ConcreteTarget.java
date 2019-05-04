package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 具体目标角色
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("目标角色的方法");
    }
}
