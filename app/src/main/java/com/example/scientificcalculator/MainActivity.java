package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView userinput, Box;

    Double num1, num2, answer;
    String sign, val_1, val_2;
    boolean has_Dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userinput = (TextView) findViewById(R.id.input);
        Box = (TextView) findViewById(R.id.suser);

        has_Dot = false;

    }


    public void btn_0(View view) {
        userinput.setText(userinput.getText() + "0");
    }


    public void btn_1(View view) {
        userinput.setText(userinput.getText() + "1");
    }


    public void btn_2(View view) {
        userinput.setText(userinput.getText() + "2");
    }


    public void btn_3(View view) {
        userinput.setText(userinput.getText() + "3");
    }


    public void btn_4(View view) {
        userinput.setText(userinput.getText() + "4");
    }


    public void btn_5(View view) {
        userinput.setText(userinput.getText() + "5");
    }


    public void btn_6(View view) {
        userinput.setText(userinput.getText() + "6");
    }


    public void btn_7(View view) {
        userinput.setText(userinput.getText() + "7");
    }


    public void btn_8(View view) {
        userinput.setText(userinput.getText() + "8");
    }


    public void btn_9(View view) {
        userinput.setText(userinput.getText() + "9");
    }


    public void btn_dot(View view) {
        if (!has_Dot) {
            if (userinput.getText().equals("")) {

                userinput.setText("0.");
            } else {

                userinput.setText(userinput.getText() + ".");
            }

            has_Dot = true;
        }

    }

    public void btn_add(View view) {
        sign = "+";
        val_1 = userinput.getText().toString();
        userinput.setText(null);
        Box.setText("+");
        has_Dot = false;
    }

    public void btn_subtract(View view) {
        sign = "-";
        val_1 = userinput.getText().toString();
        userinput.setText(null);
        Box.setText("-");
        has_Dot = false;
    }

    public void btn_multiply(View view) {
        sign = "*";
        val_1 = userinput.getText().toString();
        userinput.setText(null);
        Box.setText("×");
        has_Dot = false;
    }

    public void btn_divide(View view) {
        sign = "/";
        val_1 = userinput.getText().toString();
        userinput.setText(null);
        Box.setText("÷");
        has_Dot = false;
    }


    public void btn_log(View view) {
        sign = "log";
        userinput.setText(null);
        Box.setText("log");
        has_Dot = false;
    }


    public void btn_ln(View view) {
        sign = "ln";
        userinput.setText(null);
        Box.setText("ln");
        has_Dot = false;
    }

    public void btn_power(View view) {
        sign = "power";
        val_1 = userinput.getText().toString();
        userinput.setText(null);
        has_Dot = false;
        Box.setText("xⁿ");
    }

    public void btn_factorial(View view) {
        sign = "factorial";
        userinput.setText(null);
        has_Dot = false;
        Box.setText("!");
    }


    public void btn_sin(View view) {
        sign = "sin";
        userinput.setText(null);
        has_Dot = false;
        Box.setText("sin");
    }


    public void btn_cos(View view) {
        sign = "cos";
        userinput.setText(null);
        has_Dot = false;
        Box.setText("cos");
    }


    public void btn_tan(View view) {
        sign = "tan";
        userinput.setText(null);
        has_Dot = false;
        Box.setText("tan");
    }

    public void btn_root(View view) {
        sign = "root";
        userinput.setText(null);
        has_Dot = false;
        Box.setText("√");
    }


    public void btn_equal(View view) {
        if (sign == null) {
            Box.setText("Error!");
        } else if (userinput.getText().equals("")) {
            Box.setText("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && val_1.equals("")) {
            Box.setText("Error!");
        } else {
            switch (sign) {
                default:
                    break;
                case "log":
                    val_1 = userinput.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    userinput.setText(Math.log10(num1) + "");
                    sign = null;
                    Box.setText(null);
                    break;
                case "ln":
                    val_1 = userinput.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    userinput.setText(Math.log(num1) + "");
                    sign = null;
                    Box.setText(null);
                    break;
                case "power":
                    num1 = Double.parseDouble((val_1));
                    val_2 = userinput.getText().toString();
                    num2 = Double.parseDouble(val_2);
                    userinput.setText(Math.pow(num1, num2) + "");
                    sign = null;
                    Box.setText(null);
                    break;
                case "root":
                    val_1 = userinput.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    userinput.setText(Math.sqrt(num1) + "");
                    sign = null;
                    Box.setText(null);
                    break;
                case "factorial":
                    val_1 = userinput.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    int i = Integer.parseInt(val_1) - 1;

                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }

                    userinput.setText(num1 + "");
                    sign = null;
                    Box.setText(null);
                    break;
                case "sin":
                    val_1 = userinput.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    userinput.setText(Math.sin(num1) + "");
                    sign = null;
                    Box.setText(null);
                    break;
                case "cos":
                    val_1 = userinput.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    userinput.setText(Math.cos(num1) + "");
                    sign = null;
                    Box.setText(null);
                    break;
                case "tan":
                    val_1 = userinput.getText().toString();
                    num1 = Double.parseDouble((val_1));
                    userinput.setText(Math.tan(num1) + "");
                    sign = null;
                    Box.setText(null);
                    break;
                case "+":
                    val_2 = userinput.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 + num2;
                    userinput.setText(answer + "");
                    sign = null;
                    Box.setText(null);
                    break;
                case "-":
                    val_2 = userinput.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 - num2;
                    userinput.setText(answer + "");
                    sign = null;
                    Box.setText(null);
                    break;
                case "*":
                    val_2 = userinput.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 * num2;
                    userinput.setText(answer + "");
                    sign = null;
                    Box.setText(null);
                    break;
                case "/":
                    val_2 = userinput.getText().toString();
                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);
                    answer = num1 / num2;
                    userinput.setText(answer + "");
                    sign = null;
                    Box.setText(null);
                    break;
            }

        }
    }


    public void btn_delete(View view) {
        if (userinput.getText().equals("")) {
            userinput.setText(null);
        } else {
            int len = userinput.getText().length();
            String s = userinput.getText().toString();
            if (s.charAt(len - 1) == '.') {
                has_Dot = false;
                userinput.setText(userinput.getText().subSequence(0, userinput.getText().length() - 1));

            } else {
                userinput.setText(userinput.getText().subSequence(0, userinput.getText().length() - 1));
            }
        }
    }

    public void btn_clear(View view) {

        userinput.setText(null);
        Box.setText(null);
        val_1 = null;
        val_2 = null;
        sign = null;
        has_Dot = false;
    }


}
