package tech.println.structural.decorator;


public class Main {

    public static void main(String[] args) {

        Man man = new Man();
        UnderWearDecorator decorator = new UnderWearDecorator(man);
        BaseWearDecorator decorator1 = new BaseWearDecorator(decorator);
        OuterWearDecorator decorator2 = new OuterWearDecorator(decorator1);

        UnderWearDecorator decoratorMan2 = new UnderWearDecorator(man);

        System.out.println("Walk in hours  for Man1 " + decorator2.walkInHours(0));
        System.out.println("Walk in hours for Man1 " + decorator2.walkInHours(-10));
        System.out.println("Walk in hours for Man1 " + decorator2.walkInHours(-30));

        System.out.println("Walk in hours for Man2 " + decoratorMan2.walkInHours(-10));
        System.out.println("Walk in hours for Man2 " + decoratorMan2.walkInHours(-30));

    }
}
