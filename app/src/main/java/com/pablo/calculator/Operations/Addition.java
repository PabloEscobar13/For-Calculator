package com.pablo.calculator.Operations;

import com.pablo.calculator.info.OperationButton;

/**
 * Created by Pablo on 04.06.2016.
 */
public class Addition extends OperationButton implements Calculation {

    private static final String PLUS = " + ";

    public Addition() {
        super(PLUS);
    }

    @Override
    public double result(double first, double second) {
        return first + second;
    }
}


