package tech.println.behavioral.visitor;

public interface Visitor {

    String describeTable(Table table);
    String describeChair(Chair table);
    String describeSofa(Sofa table);
}
