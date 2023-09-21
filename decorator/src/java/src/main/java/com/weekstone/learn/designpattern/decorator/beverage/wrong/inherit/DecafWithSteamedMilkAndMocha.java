package com.weekstone.learn.designpattern.decorator.beverage.wrong.inherit;

/**
 * 根据需求不断地组合不同种类的饮料和不同种类的调料，产生新的类。这样的组合会产生子类爆炸，类的数量是：4*4!。
 * 本例子就是其中一个组合。
 * 例子中调味品的种类和价格可以用某种方式比如枚举解决，但是子类爆炸是解决不了。
 *
 * @author jinlei
 * @date 2023/1/28
 */
public class DecafWithSteamedMilkAndMocha extends Decaf {

    public DecafWithSteamedMilkAndMocha() {
        description = super.getDescription() + ", 蒸奶, 摩卡";
    }

    @Override
    public float cost() {
        return super.cost() + 1.0f + 2.0f;
    }
}
