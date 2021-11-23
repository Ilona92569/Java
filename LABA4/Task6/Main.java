package Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(5);
        list.add(2);
        list.add(895);
        list.add(3);
        list.add(8);
        Scanner sc = new Scanner(System.in);
        int task;
        do {
            System.out.println("Enter task:");
            System.out.println("1 - Show numbers");
            System.out.println("2 - Add number");
            System.out.println("3 - Delete number");
            System.out.println("4 - Search number");
            System.out.println("5 - Exit");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            task = sc.nextInt();
            switch (task) {
                case 1:
                    for (Integer i :
                            list) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    addNumber(list);
                    break;
                case 3:
                    deleteNumber(list);
                    break;
                case 4:
                    System.out.println(list.get(numberSearch(list)));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("There is no such task number");
            }
        } while (task != 5);

    }

    public static void addNumber(List<Integer> list) {
        int number = interNumber();
        list.add(number);
    }

    public static void deleteNumber(List<Integer> list) {
        int index = interIndex(list);
        list.remove(index);
    }

    public static int numberSearch(List<Integer> list) {
        int number = interNumber();
        int[] mass = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            mass[i] = Math.abs(list.get(i) - number);
        }
        int min = mass[0];
        int index = 0;
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
                index = i;
            }
        }
        return index;
    }

    public static int interNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter number");
        while (!sc.hasNextInt()) {
            System.out.println("Again");
            sc.next();
        }
        number = sc.nextInt();
        return number;
    }

    public static int interIndex(List<Integer> list) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter index");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            number = sc.nextInt();
        } while (number < 0 || number > list.size());
        return number;
    }
}
