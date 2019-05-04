package test;

import main.*;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //声明所有责任处理类
        Handler handler1 = new ConcreteHandler1(LevelEnum.LEVEL_1.getLevel());
        Handler handler2 = new ConcreteHandler2(LevelEnum.LEVEL_2.getLevel());

        //设置责任链
        handler1.setNexthandler(handler2);
        Response response = handler1.handleMessage("1");
        System.out.println(response);

        Response response1 = handler1.handleMessage("2");
        System.out.println(response1);

        Response response2 = handler1.handleMessage("3");
        System.out.println(response2);
    }
}