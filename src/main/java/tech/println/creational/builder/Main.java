package tech.println.creational.builder;



import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        House woodHouse = House.builder()
                .project("new House for family")
                .floors(2)
                .typeMaterial(TypeMaterial.WOOD)
                .build();

        System.out.println(woodHouse);


    }
}
