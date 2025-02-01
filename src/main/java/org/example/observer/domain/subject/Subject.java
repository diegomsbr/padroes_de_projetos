package org.example.observer.domain.subject;

import org.example.observer.domain.observer.Observer;

public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
