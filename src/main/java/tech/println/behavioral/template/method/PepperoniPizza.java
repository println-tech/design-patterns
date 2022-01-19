package tech.println.behavioral.template.method;

public class PepperoniPizza extends AbstractPizza {


    @Override
    protected void putIngredients() {
        System.out.println("Add tomato, pepperoni, cheese");
    }
}
