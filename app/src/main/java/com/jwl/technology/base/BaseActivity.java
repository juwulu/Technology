package com.jwl.technology.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by lujunwu on 2018/3/7.
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

    public P mPresenter;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        mPresenter = createPresenter();
        super.onCreate(savedInstanceState, persistentState);
    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        if (mPresenter == null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }
}
