package com.thundercats.queuer.constants;

/**
 * Created by kmchen1 on 1/21/14.
 */
public enum MyColor {

    RED("Red", 5),
    BLUE("Blue", 6);


    private final String name;
    private final int color;

    private MyColor(String name, int color) {
        this.name = name;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

}
