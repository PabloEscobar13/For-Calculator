package com.pablo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.pablo.calculator.Operations.Addition;
import com.pablo.calculator.Operations.Division;
import com.pablo.calculator.Operations.Subtraction;
import com.pablo.calculator.Operations.Multiplication;
import com.pablo.calculator.info.Button;
import com.pablo.calculator.info.Comma;
import com.pablo.calculator.info.NumberButton;
import com.pablo.calculator.info.OperationButton;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    String calculatedValue="";
    TextView textView;
    double firstDouble;
    double secondDouble;
    OperationButton theCalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.calcText);
    }

    DecimalFormat format = new DecimalFormat("0.######");
    NumberButton numberButton0 = new NumberButton(0);
    NumberButton numberButton1 = new NumberButton(1);
    NumberButton numberButton2 = new NumberButton(2);
    NumberButton numberButton3 = new NumberButton(3);
    NumberButton numberButton4 = new NumberButton(4);
    NumberButton numberButton5 = new NumberButton(5);
    NumberButton numberButton6 = new NumberButton(6);
    NumberButton numberButton7 = new NumberButton(7);
    NumberButton numberButton8 = new NumberButton(8);
    NumberButton numberButton9 = new NumberButton(9);

    OperationButton buttonAdd = new Addition ();
    OperationButton buttonSubtract = new Subtraction();
    OperationButton buttonMultiply = new Multiplication();
    OperationButton buttonDivide = new Division();
    Button buttonComma = new Comma();

    public void add0(View view) {

        calculatedValue = numberButton0.addToString(calculatedValue);
        textView.setText(calculatedValue);
    }

    public void add1(View view) {

        calculatedValue = numberButton1.addToString(calculatedValue);
        textView.setText(calculatedValue);
    }

    public void add2(View view) {

        calculatedValue = numberButton2.addToString(calculatedValue);
        textView.setText(calculatedValue);
    }

    public void add3(View view) {

        calculatedValue = numberButton3.addToString(calculatedValue);
        textView.setText(calculatedValue);
    }

    public void add4(View view) {

        calculatedValue = numberButton4.addToString(calculatedValue);
        textView.setText(calculatedValue);
    }

    public void add5(View view) {

        calculatedValue = numberButton5.addToString(calculatedValue);
        textView.setText(calculatedValue);
    }

    public void add6(View view) {

        calculatedValue = numberButton6.addToString(calculatedValue);
        textView.setText(calculatedValue);
    }

    public void add7(View view) {

        calculatedValue = numberButton7.addToString(calculatedValue);
        textView.setText(calculatedValue);
    }

    public void add8(View view) {

        calculatedValue = numberButton8.addToString(calculatedValue);
        textView.setText(calculatedValue);
    }

    public void add9(View view) {

        calculatedValue = numberButton9.addToString(calculatedValue);
        textView.setText(calculatedValue);
    }

    public void addition(View view) {

        try {
            firstDouble = Double.parseDouble(calculatedValue);
            calculatedValue = buttonAdd.addToString(calculatedValue);
            textView.setText(calculatedValue);
            calculatedValue = "";
            theCalculate = buttonAdd;
        }catch (Exception ex){

        }
    }

    public void subtraction(View view) {

        try {

            firstDouble = Double.parseDouble(calculatedValue);
            calculatedValue = buttonSubtract.addToString(calculatedValue);
            textView.setText(calculatedValue);
            calculatedValue = "";
            theCalculate = buttonSubtract;
        }catch (Exception ex){

        }
    }

    public void multiplication(View view) {

        try {
            firstDouble = Double.parseDouble(calculatedValue);
            calculatedValue = buttonMultiply.addToString(calculatedValue);
            textView.setText(calculatedValue);
            calculatedValue = "";
            theCalculate = buttonMultiply;
        }catch (Exception ex){

        }
    }

    public void division(View view) {

        try {
            firstDouble = Double.parseDouble(calculatedValue);
            calculatedValue = buttonDivide.addToString(calculatedValue);
            textView.setText(calculatedValue);
            calculatedValue = "";
            theCalculate = buttonDivide;
        }catch (Exception ex){

        }
    }

    public void comma(View view) {

        calculatedValue = buttonComma.addToString(calculatedValue);
        textView.setText(calculatedValue);
    }


    public void equals(View view) {

        try {
            secondDouble = Double.parseDouble(calculatedValue);
            double res = theCalculate.result(firstDouble, secondDouble);
            firstDouble = res;
            calculatedValue = format.format(res);
            textView.setText(calculatedValue);
            calculatedValue = "";
        }catch (Exception ex){

        }
}
}