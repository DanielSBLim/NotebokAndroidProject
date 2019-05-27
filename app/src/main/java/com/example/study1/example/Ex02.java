package com.example.study1.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.study1.R;

public class Ex02 extends AppCompatActivity {
    Button mEx02Btn01;
    TextView mEx02TV01;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex02);
        mSetup();
        eventClick();

    }

    private void mSetup() {
        mEx02Btn01 = findViewById(R.id.ex02_btn01);
        mEx02TV01 = findViewById(R.id.ex02_textview01);
    }

    private void eventClick() {
        mEx02Btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ex02.this, Ex02_02.class)
                );
            }
        });
    }


}


