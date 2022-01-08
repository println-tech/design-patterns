package tech.println.structural.case_special;

public class ChocolateCandy implements ICandy{

    private String filling;

    public ChocolateCandy() {
        filling = "Chocolate";
    }

    @Override
    public String getDescription() {
        return filling;
    }
}
