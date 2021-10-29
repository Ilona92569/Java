package zad_2;

import java.util.Scanner;

public class Array {
    public String arr;

    public Array() {
    }

    public Array(String arr) {
        this.arr = arr;
    }

    public static void show(Array ob1) {
        System.out.println("" + ob1.arr);
    }

    public static void vvod(Array[] mas, int pr) {
        switch (pr) {
            case 1:
                Array ob1 = new Array("1k54623");
                Array ob2 = new Array("158k309");
                Array.zad1(ob1);
                Array.zad2(ob1, ob2);
                Array.zad3(ob1, ob2);
                Array.zad4(ob1, ob2);
                Array.zad5(ob2);
                break;
            case 2:
                Array.zad6(mas);
                break;
            default:
                System.out.println("Номера такого задания нет");
        }
    }

    public static String Int() {
        String i;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите");
            while (!sc.hasNextLine()) {
                System.out.println("Введите ещё раз");
                sc.next();
            }
            i = sc.nextLine();
        } while (i.length() < 0);
        return i;
    }

    public static int Int2() {
        int i;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите");
            while (!sc.hasNextInt()) {
                System.out.println("Введите ещё раз");
                sc.next();
            }
            i = sc.nextInt();
        } while (i < 0 || i > 1);
        return i;
    }

    public static void zad1(Array ob1) {
        String i = Int();
        if (ob1.arr.indexOf(i) > 0) System.out.println("Символ " + i + " есть в множестве: " + ob1.arr);
        else System.out.println("Символа " + i + " нет в множестве: " + ob1.arr);
    }

    public static void zad2(Array ob1, Array ob2) {
        String a = "";
        char b = ' ';
        for (int i = 0; i < ob1.arr.length(); i++) {
            for (int j = 0; j < ob2.arr.length(); j++) {
                if (ob1.arr.charAt(i) == ob2.arr.charAt(j)) {
                    b = ob1.arr.charAt(i);
                    a += b;
                }
            }
        }
        System.out.println("Пересечение множеств: " + a);
    }

    public static void zad3(Array ob1, Array ob2) {
        String a = "";
        char b = ' ';
        int t = 0;
        a = ob1.arr;
        for (int i = 0; i < ob2.arr.length(); i++) {
            for (int j = 0; j < ob1.arr.length(); j++) {
                if (ob2.arr.charAt(i) == ob1.arr.charAt(j)) {
                    t++;
                }
            }
            b = ob2.arr.charAt(i);
            if (t == 0) {
                a += b;
                t = 0;
            } else t = 0;
        }
        System.out.println("Объеденине множеств: " + a);
    }


    public static void zad4(Array ob1, Array ob2) {
        String a = "";
        char b = ' ';
        int t = 0;
        for (int i = 0; i < ob1.arr.length(); i++) {
            for (int j = 0; j < ob2.arr.length(); j++) {
                if (ob1.arr.charAt(i) == ob2.arr.charAt(j)) {
                    t++;
                }
            }
            b = ob1.arr.charAt(i);
            if (t == 0) {
                a += b;
                t = 0;
            } else t = 0;
        }
        for (int i = 0; i < ob2.arr.length(); i++) {
            for (int j = 0; j < ob1.arr.length(); j++) {
                if (ob2.arr.charAt(i) == ob1.arr.charAt(j)) {
                    t++;
                }
            }
            b = ob2.arr.charAt(i);
            if (t == 0) {
                a += b;
                t = 0;
            } else t = 0;
        }
        System.out.println("Разность множеств: " + a);
    }

    public static void zad5(Array ob1) {
        String i = Int();
        int j = ob1.arr.length();
        ob1.arr += i;
        show(ob1);
    }

    public static Array[] createMass(int n) {
        Array mas[] = new Array[n];
        mas[0] = new Array("125454879985645264");
        mas[1] = new Array("1488798799875546487");
        mas[2] = new Array();
        return mas;
    }

    public static void zad6(Array[] mas) {
        int i = Int2();
        String a = mas[i].arr;
        for (int j = 0; j < mas.length; j++) {
            mas[2].arr += mas[i].arr.charAt(j);
        }
        show(mas[i]);
    }
}
