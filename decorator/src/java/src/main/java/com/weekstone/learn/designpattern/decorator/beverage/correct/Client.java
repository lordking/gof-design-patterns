package com.weekstone.learn.designpattern.decorator.beverage.correct;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.BasicConfigurator;

@Slf4j
class Client {

    public static void main(String[] args) {

        BasicConfigurator.configure();

        Beverage houseBlend = new HouseBlend();
        display(houseBlend);

        Beverage darkRoast = new DarkRoast();
        display(darkRoast);

        Beverage decaf = new Decaf();
        display(decaf);

        Beverage espresso = new Espresso();
        display(espresso);

        // 通过装饰器，我们想怎么组合就怎么组合
        SteamedMilk decafWithSteamedMilk = new SteamedMilk(decaf);
        Mocha decafWithSteamedMilkAndMocha = new Mocha(decafWithSteamedMilk);
        display(decafWithSteamedMilkAndMocha);
    }

    private static void display(Beverage beverage) {
        log.debug("{} : {} 元", beverage.getDescription(), beverage.cost());
    }
}