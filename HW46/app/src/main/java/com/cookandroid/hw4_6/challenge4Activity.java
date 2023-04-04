package com.cookandroid.hw4_6;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class challenge4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_challenge4);

        Button send_button = (Button) findViewById(R.id.button11);
        EditText smsInput = (EditText) findViewById(R.id.smsInput);


        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = smsInput.getText().toString();
                Toast toast = Toast.makeText(getApplicationContext(),message, Toast.LENGTH_SHORT);
                toast.show();
            }
        });



    }
}