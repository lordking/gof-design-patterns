package com.weekstone.learn.designpattern.decorator.beverage.wrong.override;

import lombok.extern.slf4j.Slf4j;

/**
 * 星巴克有四种基础咖啡：
 * - 综合咖啡，又称星巴克首选咖啡 House Blend 8.9
 * - 深度烘焙咖啡 Dark Roast 9.9
 * - 无咖啡因咖啡 Decaf 10.9
 * - 蒸馏咖啡，又称意式咖啡 Espresso 18.9
 * 购买时，可以要求加入四种调料。这四种调料可以不加，也可以加入多种。
 * - 蒸奶 Steamed SteamedMilk 1.0
 * - 豆浆 Soy 1.5
 * - 摩卡 Mocha 2.0
 * - 奶泡 Whip 1.2
 * <p>
 * 通过重载实现的错误案例，违反了开闭原则。对扩展开放，对修改关闭
 *
 * @author jinlei
 * @date 2023/1/28
 */
@Slf4j
public class Beverage {

    protected String description = "未知的饮料";

    // 如果想增加调料，只能为调料修改代码，添加饮料的变量
    // 这违反开闭原则，对扩展开放，修改关闭。
    protected SteamedMilk steamedMilk;

    protected Soy soy;

    protected Mocha mocha;

    protected Whip whip;

    private boolean hasSteamedMilk() {
        return steamedMilk != null;
    }

    protected void setSteamedMilk(SteamedMilk steamedMilk) {
        this.steamedMilk = steamedMilk;
    }

    private boolean hasSoy() {
        return soy != null;
    }

    protected void setSoy(Soy soy) {
        this.soy = soy;
    }

    private boolean hasMocha() {
        return mocha != null;
    }

    protected void setMocha(Mocha mocha) {
        this.mocha = mocha;
    }

    private boolean hasWhip() {
        return whip != null;
    }

    protected void setWhip(Whip whip) {
        this.whip = whip;
    }

    public String getDescription() {
        String description = "";

        if (hasSteamedMilk()) description = String.format("%s, %s", description, steamedMilk.getDescription());
        if (hasSoy()) description = String.format("%s, %s", description, soy.getDescription());
        if (hasMocha()) description = String.format("%s, %s", description, mocha.getDescription());
        if (hasWhip()) description = String.format("%s, %s", description, whip.getDescription());

        return description;
    }

    public float cost() {
        float cost = 0.0f;
        if (hasSteamedMilk()) cost += steamedMilk.cost();
        if (hasSoy()) cost += soy.cost();
        if (hasMocha()) cost += mocha.cost();
        if (hasWhip()) cost += whip.cost();

        return cost;
    }
}
