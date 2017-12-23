package com.xpf.observer2;

/**
 * Created by xpf on 2017/12/23 :)
 * GitHub:xinpengfei520
 * Function:观察者的基类，抽象观察者(定义标准)
 * 扩展:
 * java中已经帮我们定义了观察者和被观察者的接口，我们只需要直接实现即可。
 * 观察者模式体现了：迪米特原则、开闭原则、里氏替换原则、依赖倒置原则
 * 因为实现了类间解耦——迪米特原则
 * 因为使用了抽象类——开闭原则
 * 因为使用了抽象类——里氏替换原则
 * 因为使用了抽象类和继承——依赖倒置原则
 */

public interface Observer {

    void update(String content);
}
