package com.weekstone.learn.designpattern.strategy.duck.correct;

import lombok.extern.slf4j.Slf4j;

/**
 * 有一个模拟鸭子的电子游戏：
 * 初始版本：有两种鸭子，绿头鸭，红头鸭。需要显示它们的外观，并且执行它们的行为——游泳、呱呱叫、飞行。
 * 第一次变更：增加一个新的鸭子品类——橡皮鸭。新的鸭子不会飞，但可以发出吱吱叫。
 * 第二次变更，增加一个新的鸭子品类——诱饵鸭。新的鸭子既不会飞，也不会叫
 *
 * @author jinlei
 * @date 2022/12/26
 */
@Slf4j
public abstract class Duck {

    private Flyable flyable;

    private Quackable quackable;

    private String name;

    public Duck(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    protected void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    protected void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public void displayName() {
        log.info("鸭子种类: {}", name);
    }

    public void performQuack() {
        flyable.fly();
    }

    public void swim() {
        log.info("在水中游荡");
    }

    public abstract void display();

    public void performFly() {
        quackable.quack();
    }
}
