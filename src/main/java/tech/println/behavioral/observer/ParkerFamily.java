package tech.println.behavioral.observer;

public class ParkerFamily implements Observer {

    @Override
    public void update(String newspaper) {
        getNewspaper(newspaper);
    }


    private void getNewspaper(String newspaper) {
        System.out.println("Parker Family get newspaper " + newspaper);
    }
}
