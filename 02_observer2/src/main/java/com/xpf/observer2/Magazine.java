package com.xpf.observer2;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by xpf on 2017/12/23 :)
 * GitHub:xinpengfei520
 * Function:被观察者“杂志”(被观察者基类的具体实现，即标准的具体实现)
 */

public class Magazine implements Observable {

    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String content) {
        for (Observer observer : observers) {
            observer.update(content);
        }
    }

    /**
     * 递送杂志的具体实现，通知订阅者，分发杂志
     */
    public void deliverMagazine() {
        Date date = new Date();
        String content = "您已收到" + date + "期的杂志一份。";
        this.notifyObservers(content);
    }
}
