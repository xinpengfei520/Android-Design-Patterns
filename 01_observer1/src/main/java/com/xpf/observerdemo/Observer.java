package com.xpf.observerdemo;

import android.os.Handler;
import android.os.Looper;

/**
 * Created by xpf on 2017/10/27 :)
 * Function:观察者接口实现
 */

public abstract class Observer implements ObserverInterface {

    private Handler mHandler;

    public Observer() {
        mHandler = new Handler(Looper.getMainLooper());
    }

    public abstract void onChange(String message);

    @Override
    public void dispatchChange(String message) {
        mHandler.post(new NotificationRunnable(message));
    }

    private final class NotificationRunnable implements Runnable {
        private String message;

        public NotificationRunnable(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            Observer.this.onChange(message);
        }
    }
}
