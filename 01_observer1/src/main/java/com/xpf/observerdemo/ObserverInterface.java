package com.xpf.observerdemo;

/**
 * Created by xpf on 2017/10/27 :)
 * Function:抽象的观察者接口
 */

public interface ObserverInterface {
    /**
     * 根据事件进行数据或者UI的更新
     *
     * @param message
     */
    void dispatchChange(String message);
}
