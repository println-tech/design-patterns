package tech.println.behavioral.strategy;

public class KnifeStrategy implements WeaponStrategy{

    @Override
    public WeaponCharacteristic useWeapon() {
        WeaponCharacteristic characteristic = new WeaponCharacteristic(1,1, 1);
        return characteristic;
    }
}
