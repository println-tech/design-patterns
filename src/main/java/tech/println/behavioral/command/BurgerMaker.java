package tech.println.behavioral.command;

public class BurgerMaker implements BurgerMakerI{

    @Override
    public void makeBurger() {
        System.out.println("Burger is ready!");
    }
}
