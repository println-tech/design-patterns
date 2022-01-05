package tech.println.creational.singleton;

public class Main {

    public static void main(String[] args) {

        WallESingleton wallESingleton = WallESingleton.getInstance();
        System.out.println(wallESingleton.getStoreValue());
        WallESingleton wallESingleton2 = WallESingleton.getInstance();
        wallESingleton2.setStoreValue("New value");
        System.out.println(wallESingleton.getStoreValue());
    }
}
