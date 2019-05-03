package test;

import main.staticproxy.Proxy;
import main.staticproxy.SubjectImpl;

/**
 * @Auther: abird
 * @Date: 19-5-4 00:01
 * @Description:
 */
public class StaticClient {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new SubjectImpl());

        proxy.request();
    }
}
