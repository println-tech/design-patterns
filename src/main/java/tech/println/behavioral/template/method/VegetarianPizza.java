package tech.println.behavioral.template.method;

public class VegetarianPizza extends AbstractPizza {

    @Override
    protected void putIngredients() {
        System.out.println("Add tomato, olives, lettuce, mushrooms, cheese");
    }
}
