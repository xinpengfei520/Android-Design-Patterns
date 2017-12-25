package com.xpf.a03_combine;

import android.util.Log;

/**
 * Created by xpf on 2017/12/25 :)
 * GitHub:xinpengfei520
 * Function:学生对象
 */

public class Student extends RootComposite {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void doSomething() {
        super.doSomething();
        Log.e("TAG", "Student:" + name);
    }
}
