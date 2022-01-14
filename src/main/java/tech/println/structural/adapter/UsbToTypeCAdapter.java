package tech.println.structural.adapter;

public class UsbToTypeCAdapter implements TypeC {

    private USB usbDevice;

    public UsbToTypeCAdapter(USB usbDevice) {
        this.usbDevice = usbDevice;
    }

    private void charge() {
        System.out.println("Start charging through USB");
    }

    @Override
    public void connectByTypeC() {
        System.out.println("You connected to type-C through USB");
        usbDevice.connectByUSB();
        charge();

    }
}
