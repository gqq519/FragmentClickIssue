package com.gqq.fragmentclickissus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by gqq on 18/3/29.
 */

public class BaseFragment extends Fragment implements View.OnClickListener {

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        view.setOnTouchListener(this);

        view.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    }

//    @Override
//    public boolean onTouch(View v, MotionEvent event) {
//        return true;
//    }
}
