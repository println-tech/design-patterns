package tech.println.tdd.imposter;

public class BruceWillis implements Actor {

    private Integer salary;

    public BruceWillis(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String play() {
        return "Show emotions";
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    @Override
    public boolean isUnderstudy() {
        return false;
    }
}
