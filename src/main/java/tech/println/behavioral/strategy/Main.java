package tech.println.behavioral.strategy;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        System.out.println(player);
        WeaponStrategy strategy = new KnifeStrategy();
        player.useWeapon(strategy);
        System.out.println(player);
        WeaponStrategy strategyAssault = new AssaultRifflesStrategy();
        player.useWeapon(strategyAssault);
        System.out.println(player);
    }
}
