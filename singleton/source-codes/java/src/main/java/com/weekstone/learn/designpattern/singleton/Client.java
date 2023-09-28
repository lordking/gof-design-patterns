package com.weekstone.learn.designpattern.singleton;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.BasicConfigurator;

@Slf4j
public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        BasicConfigurator.configure();
        log.info("Hello World!");
    }
}
