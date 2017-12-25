package com.xpf.a03_combine;

import android.util.Log;

import java.util.List;

/**
 * Created by xpf on 2017/12/25 :)
 * GitHub:xinpengfei520
 * Function:学校对象
 */

public class School extends RootComposite {

    private String schoolName;

    public School(String schoolName, List<Classroom> classrooms) {
        this.schoolName = schoolName;
        for (Classroom classroom : classrooms) {
            add(classroom);
        }
    }

    @Override
    public void doSomething() {
        super.doSomething();
        Log.e("TAG", "School:" + schoolName);
    }
}
