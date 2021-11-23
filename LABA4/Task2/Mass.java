package Task2;

public class Mass implements Comparable<Mass>{
    public int number;

    public Mass(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Mass o) {
        return number-o.number;
    }

    @Override
    public String toString() {
        return "Mass{" +
                "number=" + number +
                '}';
    }
}
