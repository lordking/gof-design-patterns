package com.weekstone.learn.designpattern.decorator.beverage.wrong.override;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Client {

    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        display(houseBlend);

        Beverage darkRoast = new DarkRoast();
        display(darkRoast);

        Beverage decaf = new Decaf();
        display(decaf);

        Beverage espresso = new Espresso();
        display(espresso);

        decaf.setSteamedMilk(new SteamedMilk());
        decaf.setMocha(new Mocha());
        display(decaf);
    }

    private static void display(Beverage beverage) {
        System.out.printf("{} : {} 元%n", beverage.getDescription(), beverage.cost());
    }
}