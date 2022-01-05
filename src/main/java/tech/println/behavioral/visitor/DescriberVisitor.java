package tech.println.behavioral.visitor;

public class DescriberVisitor implements Visitor {

    @Override
    public String describeTable(Table table) {
        return "Table"
                + " colour of " + table.getColour().name()
                + " style of " + table.getModel().name()
                + " count of legs  " + table.getCountTableLegs();
    }

    @Override
    public String describeChair(Chair chair) {
        return "Chair"
                + " colour of " + chair.getColour().name()
                + " style of " + chair.getModel().name();
    }

    @Override
    public String describeSofa(Sofa sofa) {
        return "Sofa"
                + " colour of " + sofa.getColour().name()
                + " style of " + sofa.getModel().name();
    }
}
