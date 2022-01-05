package tech.println.behavioral.command;

public class IceCreamCommand implements OrderCommand{

    private IceCreamMakerI maker;

    public IceCreamCommand(IceCreamMakerI maker){
        this.maker = maker;
    }


    @Override
    public void execute() {
        maker.makeIceCream();
    }
}
