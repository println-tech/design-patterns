package tech.println.tdd.imposter;

public class Understudy implements Actor {

    private Integer salary;

    public Understudy(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String play() {
        return "Execute tricks....";
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    @Override
    public boolean isUnderstudy() {
        return true;
    }
}
