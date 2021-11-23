package Task4;

public class Arr implements Comparable<Arr> {
    public int number;
    public int x;

    public Arr(int number, int x) {
        this.number = number;
        this.x = x;
    }

    @Override
    public int compareTo(Arr a) {
        if (a.x > number) {
            return -1;
        } else if (a.x < number) {
            return 1;
        } else
            return 0;
    }

    @Override
    public String toString() {
        return "Mass{" +
                "number=" + number +
                '}';
    }
}
