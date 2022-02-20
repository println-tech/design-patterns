package tech.println.behavioral.observer;

import sun.lwawt.macosx.CSystemTray;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Publication {

    private PostOffice office;


    public Publication(PostOffice office) {
        this.office = office;
    }


    public void generateArticle() throws InterruptedException {
        Random r = new Random();
        TimeUnit time = TimeUnit.SECONDS;
        for(int i=0; i<5; i++){
            office.setNewspaper("New article " + new Date());
            Long duration = Long.valueOf(r.nextInt(5));
            System.out.println(duration);
            time.sleep(duration);
        }
    }
}
