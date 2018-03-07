package com.jwl.technology.base;

/**
 * Created by lujunwu on 2018/3/7.
 */

public class BasePresenter<V extends BaseView,M extends BaseModel> {
    public V mView;
    public M mModel;

    public BasePresenter(V view, M model) {
        if (view == null) {
            throw new NullPointerException("View must not be null");
        }
        mView = view;
        mModel = model;
    }

    public void detachView(){
        if (mView != null) {
            mView=null;
        }
    }
}
