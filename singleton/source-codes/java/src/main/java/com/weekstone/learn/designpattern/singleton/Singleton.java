package com.weekstone.learn.designpattern.singleton;

public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {
        System.out.println("Singleton is created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                // Double check
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
