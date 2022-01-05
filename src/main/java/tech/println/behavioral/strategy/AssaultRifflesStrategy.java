package tech.println.behavioral.strategy;

public class AssaultRifflesStrategy implements WeaponStrategy{

    @Override
    public WeaponCharacteristic useWeapon() {
        WeaponCharacteristic characteristic = new WeaponCharacteristic(5,3, 5);
        return characteristic;

    }
}
