package com.rakesh;

import com.rakesh.observers.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObservers(Object arg);
    void notifyAllObservers();
}
