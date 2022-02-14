package tech.println.creational.prototype;

import java.util.List;
import java.util.Optional;

public class RocketRegistry {

    private List<Prototype> prototypeList;

    public RocketRegistry(List<Prototype> prototypeList) {
        this.prototypeList = prototypeList;
    }

    public Prototype getByCountry(Country country) {
        Optional<Prototype> p = prototypeList.stream()
                .filter(l -> l.getCountryOfOrigin().equals(country))
                .findFirst();
        Prototype prototype = p.isPresent() ? p.get().clone() : new Rocket(country);
        return prototype;
    }

    public List<Prototype> getPrototypeList() {
        return prototypeList;
    }
}
