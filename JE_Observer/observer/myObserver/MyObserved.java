package myObserver;

import observerTest.Observer;

public interface MyObserved {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
