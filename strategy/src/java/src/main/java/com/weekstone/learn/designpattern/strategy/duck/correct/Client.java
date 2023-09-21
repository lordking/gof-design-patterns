package com.weekstone.learn.designpattern.strategy.duck.correct;

class Client {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck("绿头鸭");
        mallardDuck.displayName();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performQuack();
        mallardDuck.performFly();


        System.out.println("--------------------------------\n");

        Duck redheadDuck = new RedheadDuck("红头鸭");
        redheadDuck.displayName();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performQuack();
        redheadDuck.performFly();

        System.out.println("--------------------------------\n");

        Duck rubberDuck = new RubberDuck("橡皮鸭");
        rubberDuck.displayName();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        System.out.println("--------------------------------\n");

        Duck decoyDuck = new DecoyDuck("诱饵鸭");
        decoyDuck.displayName();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performQuack();
        decoyDuck.performFly();
    }
}