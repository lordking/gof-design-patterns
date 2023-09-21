package com.weekstone.learn.designpattern.builder.standard;

/**
 * 导向器，负责构造一个使用Builder接口的对象
 */
public class Director {
    private final Builder builder;

    /**
     * 构造方法，传入生成器
     * @param builder 生成器
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品构造方法，负责调用各个零件的建造方法
     * @return 产品
     */
    public Product construct() {
        builder.buildPartA("partA")
                .buildPartB("partB")
                .buildPartC("partC");
        return builder.build();
    }
}
