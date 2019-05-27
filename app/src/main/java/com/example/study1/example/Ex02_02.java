package com.example.study1.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.study1.R;

public class Ex02_02 extends AppCompatActivity {
    Button mEx02_02btn;
    EditText mEx02_02Edit;
    String getData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex02_02);
        mSetup();
        eventClick();
    }

    protected void mSetup(){
        mEx02_02btn = findViewById(R.id.ex02_02_btn);
        mEx02_02Edit = findViewById(R.id.ex02_02_edit);

    }

    protected void eventClick() {
        mEx02_02btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              getData =  mEx02_02Edit.getText().toString();
              Intent intent = new Intent();
            }
        });
    }
}
