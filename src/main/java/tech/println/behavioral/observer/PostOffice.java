package tech.println.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject{

    private List<Observer> observerList = new ArrayList<>();
    private String newspaper;

    @Override
    public boolean registerObserver(Observer o) {
        return observerList.add(o);
    }

    @Override
    public boolean removeObserver(Observer o) {
        return observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        observerList.stream()
                .forEach(o -> o.update(newspaper));
    }


    public void setNewspaper(String article) {
        this.newspaper = article;
        notifyObservers();

    }


}
