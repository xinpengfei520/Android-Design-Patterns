package com.xpf.observerdemo;

import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

public class MyService extends BaseService {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("MyService", "onCreate()");
    }

    @Override
    protected void onChange(String message) {
        Log.e("MyService", "message===" + message);
        Toast.makeText(MyService.this, "MyService:" + message, Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
