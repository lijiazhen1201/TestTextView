package com.zhenmei.testtextview.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.widget.TextView;

import com.zhenmei.testtextview.R;
import com.zhenmei.testtextview.tools.MyClickable;

/**
 * Created by zhenmei on 16/2/15.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private TextView tvMain;
    private int textColor;

    private void initView() {
        tvMain = (TextView) findViewById(R.id.tv_main);
        textColor=getResources().getColor(android.R.color.holo_blue_light);

        //要点击的文字
        String first = "FirstActivity";
        String second = "SecondActivity";
        //实例化SpannableString
        SpannableString spsFirst = new SpannableString(first);
        SpannableString spsSecond = new SpannableString(second);
        //实例化ClickableSpan，传入要跳转的Activity
        ClickableSpan clsFirst = new MyClickable(this, FirstActivity.class,textColor);
        ClickableSpan clsSecond = new MyClickable(this, SecondActivity.class,textColor);
        //确定点击的长度，接收4个参数
        //第一个是ClickableSpan对象
        //第二个是字符串开始下标
        //第三个是字符串结束下标
        //第四个是字符串的样式
        spsFirst.setSpan(clsFirst, 0, first.length(), Spanned.SPAN_MARK_MARK);
        spsSecond.setSpan(clsSecond, 0, second.length(), Spanned.SPAN_MARK_MARK);
        //拼接字符串
        tvMain.setText("点击");
        tvMain.append(spsFirst);
        tvMain.append("跳转到FirstActivity，或者点击");
        tvMain.append(spsSecond);
        tvMain.append("跳转到SecondActivity");
        //设置显示
        tvMain.setMovementMethod(LinkMovementMethod.getInstance());
    }


}
