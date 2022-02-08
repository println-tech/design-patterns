package tech.println.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Frame extends Component {

    private List<Component> children = new ArrayList<>();

    public Frame(String description) {
        super(description);
    }

    @Override
    void add(Component c) {
        children.add(c);
    }

    @Override
    void remove(Component c) {
        children.remove(c);
    }

    @Override
    List<Component> getChildren() {
        return children;
    }

    @Override
    void draw() {
        System.out.println("Draw frame " + description);
        children.stream()
                .forEach(e -> e.draw());
    }
}
