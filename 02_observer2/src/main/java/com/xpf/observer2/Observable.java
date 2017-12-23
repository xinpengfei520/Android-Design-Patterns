package com.xpf.observer2;

/**
 * Created by xpf on 2017/12/23 :)
 * GitHub:xinpengfei520
 * Function:抽象被观察者基类(定义标准)
 */

public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String content);
}
