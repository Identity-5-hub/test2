package com.example.myapplication4;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etInput;
    private TextView[] buttons = new TextView[16];  // 改为TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        etInput = findViewById(R.id.etInput);

        int[] buttonIds = {
                R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
                R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8,
                R.id.btn9, R.id.btn10, R.id.btn11, R.id.btn12,
                R.id.btn13, R.id.btn14, R.id.btn15, R.id.btn16
        };

        for (int i = 0; i < buttonIds.length; i++) {
            buttons[i] = (TextView) findViewById(buttonIds[i]);  // 添加类型转换
        }
    }

}