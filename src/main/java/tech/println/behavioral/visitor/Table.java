package tech.println.behavioral.visitor;

public class Table extends Furniture {

    private int  countTableLegs;
    public Table(Colours colour, Model model, int countTableLegs) {
        super(colour, model);
        this.countTableLegs = countTableLegs;
    }

    @Override
    public String accept(Visitor v) {
        return v.describeTable(this);
    }

    public int getCountTableLegs() {
        return countTableLegs;
    }
}
