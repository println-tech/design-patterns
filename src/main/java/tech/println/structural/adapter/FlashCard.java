package tech.println.structural.adapter;

public class FlashCard implements USB {

    @Override
    public void connectByUSB() {
        System.out.println("Connected by USB");
    }
}
