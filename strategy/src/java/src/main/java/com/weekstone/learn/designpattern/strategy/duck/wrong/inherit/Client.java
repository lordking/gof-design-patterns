package com.weekstone.learn.designpattern.strategy.duck.wrong.inherit;

class Client {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck("绿头鸭");
        mallardDuck.displayName();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.quack();
        mallardDuck.fly();


        System.out.println("--------------------------------\n");

        Duck redheadDuck = new RedheadDuck("红头鸭");
        redheadDuck.displayName();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.quack();
        redheadDuck.fly();

        System.out.println("--------------------------------\n");

        Duck rubberDuck = new RubberDuck("橡皮鸭");
        rubberDuck.displayName();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();
        rubberDuck.fly();

        System.out.println("--------------------------------\n");

        Duck decoyDuck = new DecoyDuck("诱饵鸭");
        decoyDuck.displayName();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.quack();
        decoyDuck.fly();
    }
}