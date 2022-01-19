package tech.println.behavioral.template.method;

public abstract class AbstractPizza {

    public final void preparePizza() {
        System.out.println("Start to make a Pizza");
        makeDough();
        rollOutDough();
        putIngredients();
        bakePizza();
        cutInSlices();
        System.out.println("Pizza is ready!!!");
    }

    protected abstract void putIngredients();

    private void makeDough() {
        System.out.println("Make the Dough");
    }

    private void rollOutDough() {
        System.out.println("Roll out the Dough");
    }

    private void bakePizza() {
        System.out.println("Bake the Pizza");
    }

    private void cutInSlices() {
        System.out.println("Cut in slices");
    }
}
