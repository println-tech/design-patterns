package tech.println.behavioral.visitor;

public abstract class Furniture {

    private Colours colour;
    private Model model;

    public Furniture(Colours colour, Model model) {
        this.colour = colour;
        this.model = model;
    }

    public abstract String accept(Visitor v);

    public Colours getColour() {
        return colour;
    }

    public Model getModel() {
        return model;
    }
}
