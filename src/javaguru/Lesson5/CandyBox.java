package javaguru.Lesson5;

import java.util.Objects;

public class CandyBox {

    private String name;
    private int amount;

    CandyBox(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        CandyBox candyBox = (CandyBox) obj;
        return this.name.equals(candyBox.name)
                && this.amount == candyBox.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    @Override
    public String toString() {
        return " CandyBox: {"
                + " name: " + name
                + " amount " + amount + "}";
    }
}


