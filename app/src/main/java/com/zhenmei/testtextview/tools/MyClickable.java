package com.zhenmei.testtextview.tools;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/**
 * Created by zhenmei on 16/2/15.
 */
public class MyClickable extends ClickableSpan{

    private Context mContext;
    private Class<?> cls;
    private int textColor;

    public MyClickable(Context mContext, Class<?> cls) {
        this.mContext = mContext;
        this.cls = cls;
    }

    public MyClickable(Context mContext, Class<?> cls, int textColor) {
        this.mContext = mContext;
        this.cls = cls;
        this.textColor = textColor;
    }

    //跳转到其他Activity
    @Override
    public void onClick(View widget) {
        Intent intent=new Intent(mContext,cls);
        mContext.startActivity(intent);
    }

    //设置字体颜色
    @Override
    public void updateDrawState(TextPaint ds) {
        super.updateDrawState(ds);
        ds.setColor(textColor);
    }
}
