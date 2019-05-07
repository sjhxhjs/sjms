package main;

/**
 * @auther: abird
 * @date: 2019/05/07
 * @Description:
 * 具体享元角色
 */
public class ConcreteFlyWeight1 extends FlyWeight {
    public ConcreteFlyWeight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        //业务逻辑
    }
}
