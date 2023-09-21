package com.weekstone.learn.designpattern.observer.weather.correct;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
