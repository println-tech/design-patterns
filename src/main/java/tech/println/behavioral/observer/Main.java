package tech.println.behavioral.observer;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        PostOffice office = new PostOffice();
        Publication publication = new Publication(office);
        ParkerFamily parkerFamily = new ParkerFamily();
        GrandMother mother = new GrandMother();

        office.registerObserver(parkerFamily);

        // publication of articles in a new thread for observing unsubscribes and subscriptions of observers
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                try {
                    publication.generateArticle();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }});
        t1.start();

        TimeUnit time = TimeUnit.SECONDS;
        time.sleep(1);
        office.registerObserver(mother);
        time.sleep(2);
        office.removeObserver(parkerFamily);

    }
}
