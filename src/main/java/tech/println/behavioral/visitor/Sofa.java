package tech.println.behavioral.visitor;

public class Sofa extends Furniture {


    public Sofa(Colours colour, Model model) {
        super(colour, model);
    }

    @Override
    public String accept(Visitor v) {
        return v.describeSofa(this);
    }

}
