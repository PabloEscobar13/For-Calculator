package com.pablo.calculator.Operations;

import com.pablo.calculator.info.OperationButton;

/**
 * Created by Pablo on 04.06.2016.
 */
public class Division extends OperationButton implements Calculation {

    private static final String OBELUS = " / ";

    public Division() {
        super(OBELUS);
    }

    @Override
    public double result(double first, double second) {
        return first / second;
    }
}
