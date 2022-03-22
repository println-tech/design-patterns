package tech.println.structural.decorator;

public class OuterWearDecorator extends AbstractWearDecorator{

    private Walking man;

    public OuterWearDecorator(Walking man) {
        this.man = man;
    }

    @Override
    public int walkInHours(int temperature) {
        float hours = this.man.walkInHours(temperature);
        return (int) (hours + 5);
    }
}
