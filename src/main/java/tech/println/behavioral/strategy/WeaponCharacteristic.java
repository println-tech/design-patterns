package tech.println.behavioral.strategy;

public class WeaponCharacteristic {

    private int damage;
    private int speed;
    private int money;

    public WeaponCharacteristic(int damage, int speed, int money) {
        this.damage = damage;
        this.speed = speed;
        this.money = money;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMoney() {
        return money;
    }
}
