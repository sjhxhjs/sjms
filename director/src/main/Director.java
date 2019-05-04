package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 抽象装饰类,封装构件的执行方法（提取的公共方法，
 * 因为每个构件都要执行修饰后的业务逻辑）
 */
public abstract class Director extends Component {
    private Component component;

    public Director(Component component) {
        this.component = component;
    }

    //委托被修饰者执行具体业务逻辑
    @Override
    public void operate() {
        component.operate();
    }
}
