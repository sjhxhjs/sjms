package main;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: abird
 * @date: 2019/05/07
 * @Description:享元工厂
 */
public class FlyWeightFactory {
    private static Map<String, FlyWeight> pool = new HashMap<>();

    public static FlyWeight getFlyWeight(String extrinsic) {
        FlyWeight flyWeight = null;
        if (pool.containsKey(extrinsic)) {
            flyWeight = pool.get(extrinsic);
        } else {
            flyWeight = new ConcreteFlyWeight1(extrinsic);
            pool.put(extrinsic, flyWeight);
        }

        return flyWeight;
    }
}
