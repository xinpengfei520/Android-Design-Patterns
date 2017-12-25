package com.xpf.a03_combine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xpf on 2017/12/25 :)
 * GitHub:xinpengfei520
 * Function:所有容器的抽象父类
 */

public abstract class RootComposite {

    private List<RootComposite> children = new ArrayList<>();

    public void add(RootComposite composite) {
        children.add(composite);
    }

    public void remove(RootComposite character) {
        children.remove(character);
    }

    public int count() {
        return children.size();
    }

    public RootComposite getChildrenAt(int index) {
        return children.get(index);
    }

    public void doSomething() {
        for (RootComposite composite : children) {
            /*
             * 调用的是子类重写过的方法
             */
            composite.doSomething();
        }
    }
}
