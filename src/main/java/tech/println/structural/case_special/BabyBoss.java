package tech.println.structural.case_special;

public class BabyBoss {

    private ICandy candy;
    private Mood mood = Mood.BAD;

    public BabyBoss() {

    }
    public BabyBoss(ICandy candy) {
        this.candy = candy;
        this.mood = Mood.GOOD;
    }

    public String getMood() {
        return this.mood.name();
    }
}
