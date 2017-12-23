package com.xpf.observerdemo;

/**
 * Created by xpf on 2017/10/27 :)
 * Function:定义抽象的目标角色，即抽象的被观察者
 */

public interface SubjectInterface {

    /**
     * 注册观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 解注册观察者
     *
     * @param observer
     */
    void unregisterObserver(Observer observer);

    /**
     * 通知注册的观察者进行数据或者UI的更新
     */
    void notifyObserver(String message);
}
