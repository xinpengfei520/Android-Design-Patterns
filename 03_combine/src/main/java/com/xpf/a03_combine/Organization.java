package com.xpf.a03_combine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xpf on 2017/12/25 :)
 * GitHub:xinpengfei520
 * Function:组织生成类
 */

public class Organization {

    public School producer() {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("小王"));
        students1.add(new Student("小李"));
        students1.add(new Student("小张"));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("小花"));
        students2.add(new Student("小赵"));
        students2.add(new Student("小白"));

        List<Classroom> classrooms = new ArrayList<>();
        classrooms.add(new Classroom("ClassA", students1));
        classrooms.add(new Classroom("ClassB", students2));

        return new School("北京一中", classrooms);
    }
}
