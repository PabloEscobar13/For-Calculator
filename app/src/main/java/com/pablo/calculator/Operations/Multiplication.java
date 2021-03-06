package com.pablo.calculator.Operations;

import com.pablo.calculator.info.OperationButton;

/**
 * Created by Pablo on 04.06.2016.
 */
public class Multiplication extends OperationButton implements Calculation {

    private static final String TIMES = " * ";

    public Multiplication() {
        super(TIMES);
    }

    @Override
    public double result(double first, double second) {
        return first*second;
    }
}
