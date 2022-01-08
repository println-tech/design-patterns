package tech.println.structural.case_special;


public class Main {


    public static void main(String[] args) {
        BabyBoss babyBoss = new BabyBoss();
        System.out.println(babyBoss.getMood());
        ICandy candy = new FakeCandy();
        BabyBoss babyBossWithCandy = new BabyBoss(candy);
        System.out.println(babyBossWithCandy.getMood());
    }
}
