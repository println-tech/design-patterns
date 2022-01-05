package tech.println.behavioral.strategy;

public class GunStrategy implements WeaponStrategy{

    @Override
    public WeaponCharacteristic useWeapon() {
        WeaponCharacteristic characteristic = new WeaponCharacteristic(3,2, 3);
        return characteristic;
    }
}
