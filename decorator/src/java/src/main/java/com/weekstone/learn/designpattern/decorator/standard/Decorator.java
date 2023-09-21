package com.weekstone.learn.designpattern.decorator.standard;

/**
 * 创建一个抽象装饰类，继承抽象组件类
 */
public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
