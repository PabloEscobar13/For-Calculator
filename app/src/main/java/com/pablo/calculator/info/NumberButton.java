package com.pablo.calculator.info;


/**
 * Created by Pablo on 04.06.2016.
 */
public class NumberButton extends Button{

    private int value;

    public NumberButton(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String addToString(String beginValue) {

        String number = Integer.toString(value);
        return super.addToString(beginValue) + number;
    }
}
