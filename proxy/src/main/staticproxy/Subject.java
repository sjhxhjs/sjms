package main.staticproxy;

/**
 * @Auther: abird
 * @Date: 19-5-3 23:53
 * @Description: 抽象主题类，规定了被代理类的规范
 */
public interface Subject {
    //接口规范，被代理类需要实现该规范，用于进行业务逻辑处理
    public void request();
}
