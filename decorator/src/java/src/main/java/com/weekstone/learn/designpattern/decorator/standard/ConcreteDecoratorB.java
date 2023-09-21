package com.weekstone.learn.designpattern.decorator.standard;

/**
 * 创建具体装饰类，继承抽象装饰类
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("ConcreteDecoratorB's operation");
    }
}
