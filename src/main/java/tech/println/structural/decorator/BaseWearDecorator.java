package tech.println.structural.decorator;

public class BaseWearDecorator extends AbstractWearDecorator{

    private Walking man;

    public BaseWearDecorator(Walking man) {
        this.man = man;
    }

    @Override
    public int walkInHours(int temperature) {

        float hours = this.man.walkInHours(temperature);
        return (int) (hours + 1);
    }
}
