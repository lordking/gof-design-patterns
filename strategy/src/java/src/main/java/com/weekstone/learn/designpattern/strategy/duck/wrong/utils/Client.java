package com.weekstone.learn.designpattern.strategy.duck.wrong.utils;

class Client {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck("绿头鸭");
        mallardDuck.displayName();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.quack();
        mallardDuck.fly();


        System.out.println("--------------------------------\n");

        RedheadDuck redheadDuck = new RedheadDuck("红头鸭");
        redheadDuck.displayName();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.quack();
        redheadDuck.fly();

        System.out.println("--------------------------------\n");

        RubberDuck rubberDuck = new RubberDuck("橡皮鸭");
        rubberDuck.displayName();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();

        System.out.println("--------------------------------\n");

        DecoyDuck decoyDuck = new DecoyDuck("诱饵鸭");
        decoyDuck.displayName();
        decoyDuck.display();
        decoyDuck.swim();
    }

}