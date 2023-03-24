package com.cookandroid.hw3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.cookandroid.project4_1.R;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("2021076029 장정환");

        EditText edit1 = (EditText) findViewById(R.id.Edit1);
        EditText edit2 = (EditText) findViewById(R.id.Edit2);

        Button btnAdd = (Button) findViewById(R.id.BtnAdd);
        Button btnSub = (Button) findViewById(R.id.BtnSub);
        Button btnMul = (Button) findViewById(R.id.BtnMul);
        Button btnDiv = (Button) findViewById(R.id.BtnDiv);

        TextView textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                int result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText("계산결과 : "+ String.valueOf(result));
                return false;
            }
        });
        btnSub.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                int result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("계산결과 : "+ String.valueOf(result));
                return false;
            }
        });
        btnMul.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                int result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("계산결과 : "+ String.valueOf(result));
                return false;
            }
        });
        btnDiv.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                int result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textResult.setText("계산결과 : "+ String.valueOf(result));
                return false;
            }
        });



    }
}