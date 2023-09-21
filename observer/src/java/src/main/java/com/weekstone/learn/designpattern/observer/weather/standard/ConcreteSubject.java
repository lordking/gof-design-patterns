package com.weekstone.learn.designpattern.observer.weather.standard;

import java.util.HashSet;
import java.util.Set;

public class ConcreteSubject implements Subject {

    private final Set<Observer> observers = new HashSet<>();

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getState());
        }
    }


}
