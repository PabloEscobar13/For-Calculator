package com.pablo.calculator.info;

import com.pablo.calculator.Operations.Calculation;

import java.util.IllegalFormatException;

/**
 * Created by Pablo on 04.06.2016.
 */
public class OperationButton extends Button implements Calculation {

    private String operator;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public OperationButton() {
    }

//    public double checkDouble(String calculatedValue){
//
//        if (calculatedValue == "") {
//
//            throw IllegalFormatException ;
//        }
//        return Double.parseDouble(calculatedValue);
//    }

//    public double parseDouble{
//
//
//    }


    public OperationButton(String operator) {
        this.operator = operator;
    }



    @Override
    public double result(double first, double second) {

        return 0;
    }

    @Override
    public String addToString(String beginValue) {
        return super.addToString(beginValue) + operator;
    }
}
