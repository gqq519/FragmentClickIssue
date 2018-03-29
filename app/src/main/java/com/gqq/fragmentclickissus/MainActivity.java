package com.gqq.fragmentclickissus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.container)
    FrameLayout container;

    /**
     * 当点击第二个Fragment的空白区域，会发生事件穿透，触发第一个Fragment的点击事件
     *
     * 处理方式：
     * 1. 给根布局添加属性android:cilckable="true"
     * 2. 在Fragment基类中为创建的View添加触摸监听，并一直返回true。
     * 3. 触摸监听不使用OnTouchListener，而是OnClickListener
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, FirstFragment.newInstance())
                .commit();
    }

    @OnClick(R.id.btn_add)
    public void addFragment() {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, SecondFragment.newInstance())
                .addToBackStack(null)
                .commit();
    }
}
