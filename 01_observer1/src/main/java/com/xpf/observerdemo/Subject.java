package com.xpf.observerdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xpf on 2017/10/27 :)
 * Function:
 */

public class Subject implements SubjectInterface {

    private List<Observer> mEventObservers = new ArrayList<>();
    private static volatile Subject instance;

    private Subject() {
    }

    public synchronized static Subject getInstance() {
        if (instance == null) {
            instance = new Subject();
        }
        return instance;
    }

    @Override
    public void registerObserver(Observer observer) {
        synchronized (Subject.this) {
            if (observer != null) {
                if (mEventObservers.contains(observer)) {
                    return;
                }
                mEventObservers.add(observer);
            }
        }
    }

    @Override
    public void unregisterObserver(Observer observer) {
        synchronized (Subject.this) {
            int index = mEventObservers.indexOf(observer);
            if (index >= 0) {
                mEventObservers.remove(observer);
            }
        }
    }

    @Override
    public void notifyObserver(String message) {
        if (mEventObservers != null && mEventObservers.size() > 0 && message != null) {
            for (Observer observer : mEventObservers) {
                observer.dispatchChange(message);
            }
        }
    }
}
