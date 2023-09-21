package com.weekstone.learn.designpattern.decorator.standard;

/**
 * 创建一个具体组件类，实现抽象组件类：
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent's operation");
    }
}
