package com.cookandroid.hw4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

       TabHost.TabSpec tabSpecDog = tabHost.newTabSpec("Dog").setIndicator("강아지");
        tabSpecDog.setContent(R.id.imageView1);
        tabHost.addTab(tabSpecDog);

        TabHost.TabSpec tabSpecCat= tabHost.newTabSpec("Cat").setIndicator("고양이");
        tabSpecCat.setContent(R.id.imageView2);
        tabHost.addTab(tabSpecCat);

        TabHost.TabSpec tabSpecRabbit = tabHost.newTabSpec("Rabbit").setIndicator("토끼");
        tabSpecRabbit.setContent(R.id.imageView3);
        tabHost.addTab(tabSpecRabbit);

        TabHost.TabSpec tabSpecHorse = tabHost.newTabSpec("Horse").setIndicator("말");
        tabSpecHorse.setContent(R.id.imageView4);
        tabHost.addTab(tabSpecHorse);

        tabHost.setCurrentTab(1);

    }


}