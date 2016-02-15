package com.zhenmei.testtextview.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import com.zhenmei.testtextview.R;

/**
 * Created by zhenmei on 16/2/15.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private TextView tvMain;

    private void initView() {

        tvMain = (TextView) findViewById(R.id.tv_main);
        tvMain.setGravity(Gravity.CENTER);
        tvMain.setText("SecondActivity");
    }



}
