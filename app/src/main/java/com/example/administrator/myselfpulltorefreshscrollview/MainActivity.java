package com.example.administrator.myselfpulltorefreshscrollview;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import pulltorefreshview.pulltorefresh.PullToRefreshBase;
import pulltorefreshview.pulltorefresh.PullToRefreshScrollView;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PullToRefreshScrollView pullScrollView = (PullToRefreshScrollView) findViewById(R.id.scrollViewPULL);
        pullScrollView.setMode(PullToRefreshBase.Mode.BOTH);
        //下拉刷新顶部是否使用动画
        pullScrollView.setAnimation(false);
    }
}
