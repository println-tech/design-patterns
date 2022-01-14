package tech.println.structural.adapter;

public class MacTypeC implements TypeC {

    private void charge() {
        System.out.println("Charging device....");
    }

    @Override
    public void connectByTypeC() {
        System.out.println("Connected by type-C");
        charge();
    }
}
