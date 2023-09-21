package com.weekstone.learn.designpattern.observer.weather.standard;


class Client  {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();

        subject.registerObserver(observer);
        subject.setState("running");

        subject.notifyObservers();
    }
}