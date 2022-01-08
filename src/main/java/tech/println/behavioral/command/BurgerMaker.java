package tech.println.behavioral.command;

public class BurgerMaker implements IBurgerMaker {

    @Override
    public void makeBurger() {
        System.out.println("Burger is ready!");
    }
}
