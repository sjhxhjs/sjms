package main;

/**
 * @auther: abird
 * @date: 2019/05/07
 * @Description:抽象享元角色,定义对象的内部状态，外部状态
 */
public abstract class FlyWeight {
    //内部状态
    private String intrinsic;

    //外部状态
    protected final String extrinsic;

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    public FlyWeight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate();
}
