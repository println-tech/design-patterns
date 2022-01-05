package tech.println.behavioral.command;

import java.util.ArrayList;
import java.util.List;

import static tech.println.behavioral.command.FoodType.BURGER;
import static tech.println.behavioral.command.FoodType.ICECREAM;

public class Main {

    public static void main(String[] args) {
        IceCreamMaker maker = new IceCreamMaker();
        IceCreamCommand iceCreamCommand = new IceCreamCommand(maker);

        BurgerMaker burgerMaker = new BurgerMaker();
        BurgerCafeCommand burgerCafeCommand = new BurgerCafeCommand(burgerMaker);
        Invoker invoker = new Invoker();
        invoker.setCommand(ICECREAM, iceCreamCommand);
        invoker.setCommand(BURGER, burgerCafeCommand);

        List<String> iceCreamParams = new ArrayList<>();
        iceCreamParams.add("Nice Ice cream");
        OrderItem item1 = new OrderItem(ICECREAM, iceCreamParams);

        List<String> burgerParams = new ArrayList<>();
        burgerParams.add("Nice burger");
        OrderItem item2 = new OrderItem(BURGER, burgerParams);

        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(item1);
        orderItems.add(item2);

        invoker.executeOrder(orderItems);

    }
}
