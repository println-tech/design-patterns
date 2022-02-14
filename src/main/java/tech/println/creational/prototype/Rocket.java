package tech.println.creational.prototype;

import java.util.Calendar;
import java.util.Date;

public class Rocket implements Prototype {

    private Country countryOfOrigin;
    private int year;
    private String name;

    public Rocket(Country countryOfOrigin, int year, String name) {
        this.countryOfOrigin = countryOfOrigin;
        this.year = year;
        this.name = name;
    }

    public Rocket(Country countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
        Calendar c  = Calendar.getInstance();
        this.year = c.get(Calendar.YEAR);
    }

    @Override
    public Country getCountryOfOrigin() {
        return this.countryOfOrigin;
    }

    @Override
    public Prototype clone() {
        return new Rocket(this.countryOfOrigin, this.year, this.name);
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "countryOfOrigin=" + countryOfOrigin +
                ", year='" + year + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
