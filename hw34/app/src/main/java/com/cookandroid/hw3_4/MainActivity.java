package com.cookandroid.hw3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoQ, rdoR, rdoS;
    Button btnOK;
    ImageView imgVer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("2021076029 장정환");

        TextView text1 = (TextView) findViewById(R.id.Text1);
        CheckBox chkAgree = (CheckBox) findViewById(R.id.ChkAgree);

        TextView text2 = (TextView) findViewById(R.id.Text2);
        RadioGroup rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        RadioButton rdoQ = (RadioButton) findViewById(R.id.RdoQ);
        RadioButton rdoR = (RadioButton) findViewById(R.id.RdoR);
        RadioButton rdoS = (RadioButton) findViewById((R.id.RdoS));

        Button btnOK = (Button) findViewById(R.id.BtnOK);
        ImageView imgVer = (ImageView) findViewById(R.id.ImgVer);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkAgree.isChecked()){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgVer.setVisibility(View.VISIBLE);
                }
                else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgVer.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener(){

            @SuppressLint("NonConstantResourceId")
            @Override
            public void onClick(View view) {
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.RdoQ:
                        imgVer.setImageResource(R.drawable.q);
                        break;
                    case R.id.RdoR:
                        imgVer.setImageResource(R.drawable.r);
                        break;
                    case R.id.RdoS:
                        imgVer.setImageResource(R.drawable.s);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"버전을 먼저 선택하세요.",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}