package com.bawei.wxn.wangchengen20170904;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Interpolator;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;

/**
 * Created by wxn on 2017/9/4.
 */

public class ballView extends View {

    private Paint ballPaint;

    private float mRadius = 50f;
    private ObjectAnimator objectAnimator;

    public ballView(Context context) {
        super(context);
        init();
    }




    public ballView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {

        ballPaint = new Paint();

        ballPaint.setAntiAlias(true);
        ballPaint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(getWidth()/2,getHeight()-getHeight()/4,mRadius,ballPaint);

        objectAnimator = ObjectAnimator.ofFloat(this,"rotation",0f,360f);
        float pivotX = getWidth()/2;
        float pivotY = getHeight()/2;
        this.setPivotX(pivotX);
        this.setPivotY(pivotY);
        objectAnimator.setDuration(5000);
        objectAnimator.setInterpolator(new LinearInterpolator());
        objectAnimator.setRepeatCount(-1);
//        objectAnimator.setStartDelay(500);

        objectAnimator.start();
    }

    public void setTime(int time){

//        objectAnimator.pause();
//        objectAnimator.setInterpolator(interpolator);
//
        objectAnimator.setDuration(time);
//        objectAnimator.start();



    }


//

    public float getRadius() {

        return mRadius;
    }

}
