package com.weekstone.learn.designpattern.strategy.character;

public class Knight extends Character {
    @Override
    void fight() {
        setWeapon(new SwordBehavior());
        weapon.useWeapon();
    }
}
