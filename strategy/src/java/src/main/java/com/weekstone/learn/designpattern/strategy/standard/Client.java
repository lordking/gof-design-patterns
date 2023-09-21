package com.weekstone.learn.designpattern.strategy.standard;

class Client {

    public static void main(String[] args) {

        Context context;

        System.out.println("选择策略A");
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        System.out.println("选择策略B");
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        System.out.println("选择策略C");
        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}