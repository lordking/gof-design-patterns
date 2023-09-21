package com.weekstone.learn.designpattern.observer.weather.standard;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
