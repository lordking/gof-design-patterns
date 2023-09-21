package com.weekstone.learn.designpattern.strategy.character;

public class Troll extends Character {
    @Override
    void fight() {
        setWeapon(new AxeBehavior());
        weapon.useWeapon();
    }
}
