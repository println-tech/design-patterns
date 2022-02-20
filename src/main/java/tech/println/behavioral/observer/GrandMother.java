package tech.println.behavioral.observer;

public class GrandMother implements Observer {

    @Override
    public void update(String newspaper) {
        getNewspaper(newspaper);
    }


    private void getNewspaper(String newspaper) {
        System.out.println("Grandmother get newspaper " + newspaper);
    }
}
