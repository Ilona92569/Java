package Task2;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Mass> mas= new TreeSet<>();
        mas.add(new Mass(25));
        mas.add(new Mass(0));
        mas.add(new Mass(-2));
        mas.add(new Mass(-3));
        mas.add(new Mass(77));
        mas.add(new Mass(-5));
        mas.add(new Mass(4));
        mas.add(new Mass(-525));
        mas.add(new Mass(5));
        mas.add(new Mass(-25));
        for (Mass mass:
             mas) {
            System.out.println(mass);
        }
    }
}
