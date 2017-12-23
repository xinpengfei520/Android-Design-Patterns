package com.xpf.observer2;

import android.util.Log;

/**
 * Created by xpf on 2017/12/23 :)
 * GitHub:xinpengfei520
 * Function:观察者的具体实现
 */

public class Wang implements Observer {

    @Override
    public void update(String content) {
        Log.e("TAG", "Wang:" + content);
    }
}
