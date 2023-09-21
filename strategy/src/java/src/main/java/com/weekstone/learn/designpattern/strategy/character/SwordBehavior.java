package com.weekstone.learn.designpattern.strategy.character;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        log.info("用宝剑挥舞");
    }
}
