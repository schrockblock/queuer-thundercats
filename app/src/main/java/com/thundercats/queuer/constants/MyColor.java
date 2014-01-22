package com.thundercats.queuer.constants;

/**
 * Created by kmchen1 on 1/21/14.
 */
public enum MyColor {
    RED("Red", 5);
    private final String name;

    public int getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    private final int color;
    private MyColor(String name, int color) {
        this.name = name;
        this.color = color;
    }
}
