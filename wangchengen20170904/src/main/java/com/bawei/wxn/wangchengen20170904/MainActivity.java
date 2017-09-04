package com.bawei.wxn.wangchengen20170904;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CustomProgress customProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customProgress = (CustomProgress) findViewById(R.id.CustomProgress);


    }

    public void setColor(View view){

        customProgress.setCustomColor();

    }

}
