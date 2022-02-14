package tech.println.creational.prototype;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Prototype rocketUSA = new Rocket(Country.USA, 2018, "Falcon Heavy");
        Prototype rocketChina = new Rocket(Country.USA, 2015, "Long March 11");
        Prototype rocketRussia = new Rocket(Country.USA, 2006, "Soyuz-2");

        List rockets = new ArrayList();
        rockets.add(rocketUSA);
        rockets.add(rocketChina);
        rockets.add(rocketRussia);

        RocketRegistry rocketRegistry = new RocketRegistry(rockets);

        Prototype rocketPrototype = rocketRegistry.getByCountry(Country.USA);
        System.out.println(rocketPrototype);
        System.out.println("The same objects with rocket of USA " + rocketPrototype.equals(rocketUSA));


    }
}
