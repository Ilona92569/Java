package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ilona");
        list.add("Karina");
        list.add("Anna");
        list.add("Pop");
        list.add("Kok");
        list.add("Mol");
        do {
            for (int i = 1; i < list.size(); i++) {
                list.remove(i);
            }
        } while (list.size() != 1);
        show(list);
    }

    public static void show(List<String> list) {
        for (String person :
                list) {
            System.out.println(person);
        }
    }
}
