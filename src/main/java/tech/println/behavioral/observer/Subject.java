package tech.println.behavioral.observer;

public interface Subject {

    boolean registerObserver(Observer o);
    boolean removeObserver(Observer o);
    void notifyObservers();
}
