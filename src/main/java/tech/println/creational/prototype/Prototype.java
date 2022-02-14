package tech.println.creational.prototype;

public interface Prototype {

    Country getCountryOfOrigin();
    Prototype clone();
}
