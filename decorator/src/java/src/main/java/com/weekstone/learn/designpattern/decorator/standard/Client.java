package com.weekstone.learn.designpattern.decorator.standard;


class Client {

    private Component component;
    private Decorator decoratorA;

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();

        component = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();

        Decorator decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.operation();
    }
}