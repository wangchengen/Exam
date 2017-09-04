package com.bawei.wxn.wangchengen20170904;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class MainActivity extends AppCompatActivity {
    private CustomProgress customProgress;
    private ballView ball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customProgress = (CustomProgress) findViewById(R.id.CustomProgress);

        ball = (ballView) findViewById(R.id.ball);

    }

    public void setColor(View view){

        customProgress.setCustomColor();

    }
    public void setSpeedUp(View view){

//        加速 把时间缩短
        ball.setTime(2000);

    }
    public void setSlowDown(View view){

//        减速 把时间加长
        ball.setTime(8000);

    }

}
