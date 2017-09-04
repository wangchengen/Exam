package com.bawei.wxn.wangchengen20170904;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wxn on 2017/9/4.
 */

public class CustomProgress extends View {

    private Paint mPaint;

    private int customColor;
    private float customWidth;



    public CustomProgress(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomProgress(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }


    private void init(@Nullable AttributeSet attrs) {

//        获取自定义属性
        TypedArray typedArray = getContext()
                .obtainStyledAttributes(attrs,R.styleable.CustomProgress);


        customColor = typedArray.getColor(R.styleable.CustomProgress_customColor,0);
        customWidth = typedArray.getDimension(R.styleable.CustomProgress_customWidth,0);

        mPaint = new Paint();

        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(customWidth);

        mPaint.setColor(customColor);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float x = (getWidth() - getHeight() / 2) / 2;
        float y = getHeight() / 4;

        RectF oval = new RectF(x, y, getWidth() - x, getHeight() - y);

        canvas.drawArc(oval,0,360,false,mPaint);
    }


//    设置颜色方法
    public void setCustomColor(){

        mPaint.setColor(Color.RED);
        invalidate();
    }

}
