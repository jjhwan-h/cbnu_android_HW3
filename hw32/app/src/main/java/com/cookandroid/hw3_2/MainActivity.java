package com.cookandroid.hw3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cookandroid.hw3_2.R;

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
        Button btnRes = (Button) findViewById(R.id.BtnRes);

        TextView textResult = (TextView) findViewById(R.id.TextResult);

        //덧셈
        btnAdd.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                    String num1 = edit1.getText().toString();
                    String num2 = edit2.getText().toString();

                    if(num1.equals("") || num2.equals("")){
                        Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Double result = Double.parseDouble(num1) + Double.parseDouble(num2);
                        textResult.setText("계산결과 : " + String.valueOf(result));
                    }
            }
        });
        //뺄셈
        btnSub.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                if(num1.length()==0 || num2.length()==0){
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_LONG).show();
                }
                else{
                    Double result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산결과 : "+ String.valueOf(result));
                }
            }
        });
        //곱셈
        btnMul.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                if(num1.length()==0 || num2.length()==0){
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_LONG).show();
                }
                else{
                    Double result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산결과 : "+ String.valueOf(result));
                }

            }
        });
        //나눗셈
        btnDiv.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                if(num1.length()==0 || num2.length()==0){
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_LONG).show();
                }
                else {

                    Double result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    if (Double.isInfinite(result) || Double.isNaN(result)) {
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_LONG).show();
                    } else {
                        textResult.setText("계산결과 : " + String.valueOf(result));
                    }
                }
            }
        });
        //나머지
        btnRes.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String num1 = edit1.getText().toString();
                String num2 = edit2.getText().toString();
                if(num1.length()==0 || num2.length()==0){
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_LONG).show();
                }
                else {
                        Double result = Double.parseDouble(num1) % Double.parseDouble(num2);
                        if(Double.isInfinite(result) || Double.isNaN(result)){
                            Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_LONG).show();
                        }
                        else{
                            textResult.setText("계산결과 : " + String.valueOf(result));
                        }
                }
            }
        });


    }
}