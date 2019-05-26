package com.example.study1.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.study1.R;
import com.example.study1.Utils.ToastGood;
import com.example.study1.Utils.Utils;

public class Ex01 extends AppCompatActivity {

    private final static int NUMBER_ERROR = -1;

    private EditText mEditFirst;
    private EditText mEditSecond;
    private EditText mEditOperation;
    private TextView mResult;
    private Button mCalc;
    private ToastGood mToast = new ToastGood(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex01);
        initView();
        setEvent();
   }

    private void initView() {
        mEditFirst = findViewById(R.id.firstNumber);
        mEditSecond = findViewById(R.id.secondNumber);
        mEditOperation = findViewById(R.id.operation);
        mResult = findViewById(R.id.result);
        mCalc = findViewById(R.id.calc);
    }

    private void setEvent() {
        mCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isInvalidCheck()) {
                    calc();
                }else{
                    mToast.showToast("잘못된 접근입니다");
                }
            }
        });
    }

    private void calc(){
        int firstNumber = Utils.toInt(mEditFirst.getText().toString(), NUMBER_ERROR);
        int secondNumber = Utils.toInt(mEditSecond.getText().toString(), NUMBER_ERROR);

        String operation = mEditOperation.getText().toString();

        if(firstNumber == NUMBER_ERROR || secondNumber == NUMBER_ERROR){
            mToast.showToast("숫자에러임");
            return;
        }

        int result = 0;

        if(operation.equals("+")){
            result = firstNumber + secondNumber;
        }else if(operation.equals("-")){
            result = firstNumber - secondNumber;
        }else if(operation.equals("*")){
            result = firstNumber * secondNumber;
        }else if(operation.equals("/")){
            result = firstNumber / secondNumber;
        }

        mResult.setText(String.valueOf(result));
    }

    private boolean isInvalidCheck() {
        boolean firstCheck = mEditFirst != null && mEditFirst.length() > 0;
        boolean secondCheck = mEditSecond != null && mEditSecond.length() > 0;
        boolean operationCheck = false;


        if (mEditOperation != null && mEditOperation.length() > 0) {
            String operation = mEditOperation.getText().toString();
            if (operation.equals("+") || operation.equals("-") ||
                    operation.equals("*") || operation.equals("/")) {
                operationCheck = true;
            }
        }

        return firstCheck && secondCheck && operationCheck;
    }
}


