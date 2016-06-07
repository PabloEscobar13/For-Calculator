package com.pablo.calculator.info;

/**
 * Created by Pablo on 06.06.2016.
 */
public class Comma extends Button{

    private static final String DOT = ".";


    @Override
    public String addToString(String beginValue) {

        if (beginValue == ""){
            return beginValue;
        }
        else {
            return super.addToString(beginValue) + DOT;
        }
    }
}
