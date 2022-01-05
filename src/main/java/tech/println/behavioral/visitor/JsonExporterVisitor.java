package tech.println.behavioral.visitor;

public class JsonExporterVisitor implements Visitor {

    @Override
    public String describeTable(Table table) {
        return "{" +
                "\"type\":\"table\","
                + "\"colour\":\"" + table.getColour().name() + "\","
                + "\"style\":\"" + table.getModel().name() + "\","
                + "\"count_legs\":\"" + table.getCountTableLegs() + "\""
                + "}";
    }

    @Override
    public String describeChair(Chair chair) {
        return "{" +
                "\"type\":\"chair\","
                + "\"colour\":\"" + chair.getColour().name() + "\","
                + "\"style\":\"" + chair.getModel().name() + "\""
                +  "}";
    }

    @Override
    public String describeSofa(Sofa sofa) {
        return "{" +
                "\"type\":\"sofa\","
                + "\"colour\":\"" + sofa.getColour().name() + "\","
                + "\"\"style\":\"" + sofa.getModel().name() + "\""
                +"}";
    }
}
