package com.xpf.a03_combine;

import android.util.Log;

import java.util.List;

/**
 * Created by xpf on 2017/12/25 :)
 * GitHub:xinpengfei520
 * Function:教室对象
 */

public class Classroom extends RootComposite {

    private String className;

    public Classroom(String className, List<Student> students) {
        this.className = className;
        for (Student student : students) {
            add(student);
        }
    }

    @Override
    public void doSomething() {
        super.doSomething();
        Log.e("TAG", "Classroom:" + className);
    }
}
