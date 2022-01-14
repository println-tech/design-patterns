package tech.println.structural.adapter;


public class Main {

    public static void main(String[] args) {

        USB usb = new FlashCard();
        UsbToTypeCAdapter adapter = new UsbToTypeCAdapter(usb);
        adapter.connectByTypeC();

    }
}
