package com.pablo.calculator.info;

import com.pablo.calculator.Operations.Calculation;

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

    public OperationButton(String operator) {
        this.operator = operator;
    }

//    public void setOperation(String operation) {
//        this.operation = operation;
//    }



    @Override
    public double result(double first, double second) {

        return 0;
    }



    @Override
    public String addToString(String beginValue) {
        return super.addToString(beginValue) + operator;
    }
}
