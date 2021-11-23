package Task4;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Arr> mas = new TreeSet<>();
        int x = Utils.enterX();
        mas.add(new Arr(x, x));
        mas.add(new Arr(2, x));
        mas.add(new Arr(8, x));
        mas.add(new Arr(-3, x));
        mas.add(new Arr(46, x));
        mas.add(new Arr(-521, x));
        mas.add(new Arr(1, x));
        mas.add(new Arr(-21, x));
        for (Arr mass :
                mas) {
            System.out.println(mass);
        }
    }
}
