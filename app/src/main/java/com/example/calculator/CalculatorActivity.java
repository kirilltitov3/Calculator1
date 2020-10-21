package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity  implements View.OnClickListener {

    EditText etNum1;
    EditText etNum2;

    Button bttnAdd;
    Button bttnSub;
    Button bttnMult;
    Button bttnDiv;

    TextView tvResult;

    String oper = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);

        bttnAdd = (Button) findViewById(R.id.bttnAdd);
        bttnSub = (Button) findViewById(R.id.bttnSub);
        bttnMult = (Button) findViewById(R.id.bttnMult);
        bttnDiv = (Button) findViewById(R.id.bttnDiv);

        tvResult = (TextView) findViewById(R.id.tvResult);

        bttnAdd.setOnClickListener(this);
        bttnSub.setOnClickListener(this);
        bttnMult.setOnClickListener(this);
        bttnDiv.setOnClickListener(this);
    }

    public void onClick(View view) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }
        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        switch (view.getId()) {
            case R.id.bttnAdd:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.bttnSub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.bttnMult:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.bttnDiv:
                oper = "/";
                result = num1 / num2 ;
                break;
            default:
                break;
        }
        tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }
}