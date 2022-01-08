package tech.println.structural.case_special;

public class FakeCandy implements ICandy{

    private String filling;

    public FakeCandy() {
        filling = "Empty";
    }

    @Override
    public String getDescription() {
        return filling;
    }
}
