package tech.println.tdd.imposter;

import java.util.ArrayList;
import java.util.List;

public class DieHardMovie implements Movie {

    private List<Actor> actors = new ArrayList<>();

    @Override
    public void addActors(Actor actor) {
        actors.add(actor);
    }

    @Override
    public void filming(boolean isExtreme) {
        if(isExtreme) {
            actors.stream()
                    .filter(s -> s.isUnderstudy())
                    .forEach(s -> System.out.println(s.play()));
        }
        else {
            actors.stream()
                    .filter(s -> !s.isUnderstudy())
                    .forEach(s -> System.out.println(s.play()));
        }
    }

    @Override
    public Integer budget() {
        return actors.stream()
                .mapToInt(Actor::getSalary)
                .sum();
    }
}
