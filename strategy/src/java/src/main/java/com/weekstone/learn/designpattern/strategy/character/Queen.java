package com.weekstone.learn.designpattern.strategy.character;

public class Queen extends Character {

    @Override
    void fight() {
        setWeapon(new KnifeBehavior());
        weapon.useWeapon();
    }
}
