package tech.println.structural.decorator;

public class UnderWearDecorator extends AbstractWearDecorator {

    private Walking man;

    public UnderWearDecorator(Man man) {
        this.man = man;
    }

    @Override
    public int walkInHours(int temperature) {

        float hours = this.man.walkInHours(temperature);
        return (int) (hours + 0.5);
    }
}
