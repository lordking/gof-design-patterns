package com.weekstone.learn.designpattern.strategy.character;

public abstract class Character {

    protected WeaponBehavior weapon;

    protected void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    abstract void fight();
}
