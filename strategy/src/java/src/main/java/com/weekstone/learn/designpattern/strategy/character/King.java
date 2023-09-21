package com.weekstone.learn.designpattern.strategy.character;

public class King extends Character {

    @Override
    void fight() {
        setWeapon(new BowAndArrowBehavior());
        weapon.useWeapon();
    }
}
