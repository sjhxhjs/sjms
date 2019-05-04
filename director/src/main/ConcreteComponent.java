package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 具体构件，实现业务逻辑
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("具体业务逻辑");
    }
}
