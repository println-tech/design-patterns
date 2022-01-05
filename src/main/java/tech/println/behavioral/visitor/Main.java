package tech.println.behavioral.visitor;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Visitor describer = new DescriberVisitor();
        Visitor jsonExporter = new JsonExporterVisitor();
        List<Furniture> orderOfFurniture = new ArrayList<>();
        Furniture chair1 = new Chair(Colours.BLUE, Model.POPART);
        Furniture chair2 = new Chair(Colours.RED, Model.LOFT);
        Furniture sofa = new Sofa(Colours.BROWN, Model.VINTAGE);
        Furniture table = new Table(Colours.YELLOW, Model.MODERN, 1);
        orderOfFurniture.add(chair1);
        orderOfFurniture.add(chair2);
        orderOfFurniture.add(sofa);
        orderOfFurniture.add(table);

        orderOfFurniture.stream()
                .map(f -> f.accept(describer))
                .forEach(s -> System.out.println(s));

        orderOfFurniture.stream()
                .map(f -> f.accept(jsonExporter))
                .forEach(s -> System.out.println(s));


    }
}
