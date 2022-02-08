package tech.println.structural.composite;

import java.util.List;

public abstract class Component {

    protected String description;

    public Component(String description) {
        this.description = description;
    }


    void add (Component c) {
        throw new UnsupportedOperationException();
    };

    void remove (Component c) {
        throw new UnsupportedOperationException();
    };

    List<Component> getChildren () {
        throw new UnsupportedOperationException();
    };

    abstract void draw();
}
