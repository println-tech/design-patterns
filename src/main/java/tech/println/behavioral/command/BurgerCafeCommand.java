package tech.println.behavioral.command;

public class BurgerCafeCommand implements OrderCommand{

    private BurgerMakerI burgerMaker;

    public BurgerCafeCommand(BurgerMakerI burgerMaker){
        this.burgerMaker = burgerMaker;
    }

    @Override
    public void execute() {
        burgerMaker.makeBurger();
    }
}
