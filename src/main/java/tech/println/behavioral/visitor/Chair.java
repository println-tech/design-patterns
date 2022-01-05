package tech.println.behavioral.visitor;

public class Chair extends Furniture {

    public Chair(Colours colour, Model model) {
        super(colour, model);
    }

    @Override
    public String accept(Visitor v) {
        return v.describeChair(this);
    }
}
