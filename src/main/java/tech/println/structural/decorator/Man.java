package tech.println.structural.decorator;

public class Man implements Walking {

    private int comfort = 1;

    @Override
    public int walkInHours(int temperature) {
        double wct = 33 + (0.478 + 0.2 * comfort) * (temperature-33);
        if (wct < 3) return 0;
        else if (wct < 5) return 1;
        else if (wct < 10) return 2;
        else if (wct < 70) return 5;
        else return 24;
    }

    public int getComfort() {
        return comfort;
    }

    public void setComfort(int comfort) {
        this.comfort = comfort;
    }
}
