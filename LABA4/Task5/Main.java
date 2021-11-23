package Task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        int size = 0;
        do {
            for (int i = 0; i < list.size() - 1; i++) {
                list.set(size, list.get(i) + list.get(i + 1));
                list.remove(i + 1);
                size++;
            }
            size = 0;
        } while (list.size() != 1);
        for (Integer i :
                list) {
            System.out.println(i);
        }
    }
}
