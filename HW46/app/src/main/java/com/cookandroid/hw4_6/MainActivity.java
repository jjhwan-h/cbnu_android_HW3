package com.cookandroid.hw4_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  challenge1 = (Button) findViewById(R.id.button);
        Button challenge2 = (Button) findViewById(R.id.button2);
        Button challenge4 = (Button) findViewById(R.id.button3);
        Button challenge5 = (Button) findViewById(R.id.button4);

        challenge1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,challenge1Activity.class);
                startActivity(intent);
            }
        });
        challenge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,challenge2Activity.class);
                startActivity(intent);
            }
        });
        challenge4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,challenge4Activity.class);
                startActivity(intent);
            }
        });
        challenge5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,challenge5Activity.class);
                startActivity(intent);
            }
        });
    }

}