package com.weekstone.learn.designpattern.prototype;

import org.apache.log4j.BasicConfigurator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) throws Exception {
        shallowCopy();
        deepCopy();
    }

    /**
     * 浅拷贝，只拷贝基本类型，引用类型只拷贝引用
     * @throws Exception
     */
    
    private static void shallowCopy() throws Exception {
        
        BasicConfigurator.configure();


        Address address = new Address("address1");

        System.out.println("=============== 浅拷贝 =====================");

        
        ShallowPrototype originalPrototype = new ShallowPrototype("value1", address);
        log.info("原始对象：\n{}", originalPrototype);
        

        // 拷贝对象
        ShallowPrototype clonedPrototype = originalPrototype.clone();

        // 改变拷贝对象的值，不会改变原始对象的值
        clonedPrototype.setField1("value2");
        // 仅改变拷贝对象的引用类型的值，会改变原始对象的值
        address.setAddress("address2");

        log.info("改变引用值后的拷贝对象：\n{}", clonedPrototype);
        log.info("改变引用值后的原始对象：\n{}", originalPrototype);
        log.info("浅拷贝，只拷贝基本类型，引用类型只拷贝引用，所以改变原始对象的引用类型的值，拷贝对象也会改变。");
    }

    private static void deepCopy() throws Exception {
        Address address = new Address("address1");

        System.out.println("=============== 深拷贝 =====================");

        DeepPrototype originalPrototype = new DeepPrototype("value1", address);
        log.info("原始对象：\n{}", originalPrototype);

        // 拷贝对象
        DeepPrototype clonedPrototype = originalPrototype.clone();

        // 改变拷贝对象的值，不会改变原始对象的值
        clonedPrototype.setField1("value2");
        // 仅改变拷贝对象的引用类型的值，不会改变原始对象的值
        address.setAddress("address2");

        log.info("改变引用值后的拷贝对象：\n{}", clonedPrototype);
        log.info("改变引用值后的原始对象：\n{}", originalPrototype);
        log.info("深拷贝，所有类型都拷贝，所以改变原始对象的引用类型的值，拷贝对象不会改变。");
    }
}
