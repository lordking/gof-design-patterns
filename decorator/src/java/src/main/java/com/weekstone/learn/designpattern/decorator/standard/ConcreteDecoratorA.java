package com.weekstone.learn.designpattern.decorator.standard;

/**
 * 创建具体装饰类，继承抽象装饰类
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("ConcreteDecoratorA's operation");
    }
}
