package test;

import main.LevelEnum;
import org.junit.Test;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description:
 */
public class LevelEnumTest {

    @Test
    public void test() {
        System.out.println(LevelEnum.LEVEL_1.getLevel());
        System.out.println(LevelEnum.LEVEL_2.getLevel());
    }

}
