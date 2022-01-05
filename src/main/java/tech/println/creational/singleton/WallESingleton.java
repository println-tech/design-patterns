package tech.println.creational.singleton;

public class WallESingleton {

    private String storeValue = "Value";

    private static volatile WallESingleton wallESingleton;

    private WallESingleton(){
    }

    public static WallESingleton getInstance(){
        if (wallESingleton == null){
            synchronized (WallESingleton.class){
                if (wallESingleton == null){
                    wallESingleton = new WallESingleton();
                }
            }
        }

        return wallESingleton;
    }

    public String getStoreValue() {
        return storeValue;
    }

    public void setStoreValue(String storeValue) {
        this.storeValue = storeValue;
    }
}
