package tech.println.behavioral.command;

public class BurgerCafeCommand implements OrderCommand{

    private IBurgerMaker burgerMaker;

    public BurgerCafeCommand(IBurgerMaker burgerMaker){
        this.burgerMaker = burgerMaker;
    }

    @Override
    public void execute() {
        burgerMaker.makeBurger();
    }
}
