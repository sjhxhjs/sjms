package main.staticproxy;

/**
 * @Auther: abird
 * @Date: 19-5-3 23:56
 * @Description:代理类(静态代理)
 */
public class Proxy implements Subject {
    //被代理类
    private Subject subject = null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public Proxy() {
        this.subject = new SubjectImpl();
    }

    private void before() {

    }

    private void after() {

    }

    @Override
    public void request() {
        this.before();
        subject.request();
        this.after();
    }
}
