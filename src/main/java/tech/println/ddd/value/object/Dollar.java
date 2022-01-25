package tech.println.ddd.value.object;

import java.util.Objects;

public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar sum(int value) {
        return new Dollar(this.amount + value);
    }

    public Dollar minus(int value) {
        if (this.amount < value)
            throw new IllegalArgumentException("You cannot make this operation! The value less then current.");
        return new Dollar(this.amount - value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dollar)) return false;
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return "Dollar{" +
                "amount=" + amount +
                '}';
    }
}
