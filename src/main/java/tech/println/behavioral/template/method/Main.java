package tech.println.behavioral.template.method;

public class Main {

    public static void main(String[] args) {
        AbstractPizza vegetarian = new VegetarianPizza();
        vegetarian.preparePizza();

        AbstractPizza pepperoni = new PepperoniPizza();
        pepperoni.preparePizza();


    }
}
