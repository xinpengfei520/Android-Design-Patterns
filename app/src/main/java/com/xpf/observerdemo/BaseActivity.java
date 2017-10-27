package com.xpf.observerdemo;

import android.app.Activity;
import android.os.Bundle;

import java.lang.ref.WeakReference;

/**
 * Created by xpf on 2017/10/27 :)
 * Function:Base Activity Observable
 */

public abstract class BaseActivity extends Activity {

    private ActivityObserver mActivityObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityObserver = new ActivityObserver(this);
        registerObserver(mActivityObserver);
    }

    /**
     * 注册为观察者
     *
     * @param observer
     */
    public void registerObserver(Observer observer) {
        Subject.getInstance().registerObserver(observer);
    }

    /**
     * 解注册观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer) {
        Subject.getInstance().unregisterObserver(observer);
    }

    /**
     * 该方法会在具体的观察者对象中调用，可以根据事件的类型来更新对应的UI，这个方法在UI线程中被调用，
     * 所以在该方法中不能进行耗时操作，可以另外开线程
     *
     * @param message 事件类型
     */
    protected abstract void onChange(String message);


    public static class ActivityObserver extends Observer {
        // 添加弱引用，防止对象不能被回收
        private final WeakReference<BaseActivity> mActivity;

        public ActivityObserver(BaseActivity activity) {
            super();
            mActivity = new WeakReference<BaseActivity>(activity);
        }

        @Override
        public void onChange(String message) {
            BaseActivity activity = mActivity.get();
            if (activity != null) {
                activity.onChange(message);
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        removeObserver(mActivityObserver);
    }

}
