package main;

/**
 * @auther: abird
 * @date: 2019/05/04
 * @Description: 责任状态枚举类
 */
public enum LevelEnum {
    LEVEL_1("1"),
    LEVEL_2("2"),
    LEVEL_3("3");

    private String level;
    LevelEnum(String i) {
        this.level = i;
    }

    public String getLevel() {
        return level;
    }
}
