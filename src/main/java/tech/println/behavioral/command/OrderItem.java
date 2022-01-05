package tech.println.behavioral.command;

import java.util.List;

public class OrderItem {

    private FoodType type;
    private List<String> params;

    public OrderItem(FoodType type, List<String> params) {
        this.type = type;
        this.params = params;
    }

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public FoodType getType() {
        return type;
    }

    public void setType(FoodType type) {
        this.type = type;
    }
}
