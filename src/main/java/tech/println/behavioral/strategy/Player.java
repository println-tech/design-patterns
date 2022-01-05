package tech.println.behavioral.strategy;

public class Player {

    private int speed = 20;
    private int money = 100;
    private int damage = 0;

    private WeaponStrategy strategy;

   public void useWeapon(WeaponStrategy strategy){
       WeaponCharacteristic characteristic = strategy.useWeapon();
       if (this.strategy == null) {
           changeWeapon(characteristic);
       } else {
           WeaponCharacteristic prevCharacteristic = this.strategy.useWeapon();
           this.speed = this.speed + prevCharacteristic.getSpeed();
           this.money = this.money + prevCharacteristic.getMoney();
           this.damage = this.damage + prevCharacteristic.getDamage();
           changeWeapon(characteristic);
       }
       this.strategy = strategy;
   }

   private void changeWeapon(WeaponCharacteristic characteristic) {
       this.speed = this.speed - characteristic.getSpeed();
       this.money = this.money - characteristic.getMoney();
       this.damage = this.damage - characteristic.getDamage();
   }
    @Override
    public String toString() {
        return "Player{" +
                "speed=" + speed +
                ", money=" + money +
                ", damage=" + damage +
                '}';
    }
}
