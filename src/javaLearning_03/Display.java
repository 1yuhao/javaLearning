package javaLearning_03;

import  javaLearning_02.*;

public class Display {
    private int value = 0;
    private int limit = 0;

    public Display(int limit) {
        this.limit = limit;
    }

    public void increase() {
        value++;
        if (value == limit) {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }
}
