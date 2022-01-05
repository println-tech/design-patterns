package tech.println.behavioral.command;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Invoker {

    private Map<FoodType, OrderCommand> commandMap = new HashMap<>();

    public void setCommand(FoodType type, OrderCommand command){
        commandMap.put(type, command);
    }

    public void executeOrder(List<OrderItem> orderItems){
        orderItems.forEach(i -> {
            commandMap.get(i.getType()).execute();
        });
    }
}
