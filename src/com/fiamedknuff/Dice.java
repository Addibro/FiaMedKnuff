package com.fiamedknuff;

/**
 * Created by andreas on 10/04/17.
 */
public class Dice {
    private int value;

    private static Dice instance = null;

    private Dice() {}

    public static Dice getInstance() {
        if (instance == null) {
            instance = new Dice();
        }
        return instance;
    }

    public int kasta() {
        return (int) (Math.random() * 6 + 1);
    }

    public int getValue() {
        return value;
    }

}
