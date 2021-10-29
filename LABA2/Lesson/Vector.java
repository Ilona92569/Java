package zad_2;

import java.util.Scanner;

public class Vector {
    public double x1, x2, x3;

    public Vector() {
    }

    public Vector(double x1, double x2, double x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    public static void vvod(Vector[] mas, int pr) {
        switch (pr) {
            case 1:
                Vector ob1 = new Vector(15, 22, 32);
                Vector ob2 = new Vector(11, -88, 98);
                Vector.sum(ob1, ob2);
                Vector.raz(ob1, ob2);
                Vector.ymn(ob1, ob2);
                Vector.ink(ob1);
                Vector.dec(ob2);
                break;
            case 2:
                Vector.showMas(mas);
                Vector.sum2(mas);
                Vector.len(mas);
                Vector.corner(mas);
                break;
            default:
                System.out.println("Номера такого задания нет");
        }
    }

    public static void sum(Vector ob1, Vector ob2) {
        double sum1 = ob1.x1 + ob2.x1;
        double sum2 = ob1.x2 + ob2.x2;
        double sum3 = ob1.x3 + ob2.x3;
        System.out.println("Сумма векторов: z=(" + sum1 + ";" + sum2 + ";" + sum3 + ";)");
    }

    public static void raz(Vector ob1, Vector ob2) {
        double raz1 = ob1.x1 - ob2.x1;
        double raz2 = ob1.x2 - ob2.x2;
        double raz3 = ob1.x3 - ob2.x3;
        System.out.println("Разность векторов: z=(" + raz1 + ";" + raz2 + ";" + raz3 + ";)");
    }

    public static void ymn(Vector ob1, Vector ob2) {
        double ymn1 = ob1.x1 * ob2.x1;
        double ymn2 = ob1.x2 * ob2.x2;
        double ymn3 = ob1.x3 * ob2.x3;
        System.out.println("Умножение векторов: z=(" + ymn1 + ";" + ymn2 + ";" + ymn3 + ";)");
    }

    public static void ink(Vector ob1) {
        ob1.x1++;
        ob1.x2++;
        ob1.x3++;
        System.out.println("Новый вектор:");
        ob1.show();
    }

    public static void dec(Vector ob1) {
        ob1.x1--;
        ob1.x2--;
        ob1.x3--;
        System.out.println("Новый вектор:");
        ob1.show();
    }

    public static Vector[] createMass(int n) {
        Vector mas[] = new Vector[n];
        mas[0] = new Vector(5, 101, 25);
        mas[1] = new Vector(14, 8, 54);
        mas[2] = new Vector(556, 18, 65);
        mas[3] = new Vector(11, 17, 45);
        return mas;
    }

    public void show() {
        System.out.println("z = (" + x1 + ";" + x2 + ";" + x3 + ")");
    }

    public static void showMas(Vector[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }

    public static int Int() {
        int i;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите номер вектора");
            while (!sc.hasNextInt()) {
                System.out.println("Введите ещё раз");
                sc.next();
            }
            i = sc.nextInt();
        } while (i > 3 || i < 0);
        return i;
    }

    public static int Int2() {
        int i;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите номер вектора");
            while (!sc.hasNextInt()) {
                System.out.println("Введите ещё раз");
                sc.next();
            }
            i = sc.nextInt();
        } while (i > 2 || i < 0);
        return i;
    }

    public static double sum2(Vector[] mas) {
        int i = Int2();
        double sum = (mas[i].x1 * mas[i + 1].x1) + (mas[i].x2 * mas[i + 1].x2) + (mas[i].x3 * mas[i + 1].x3);
        System.out.println("Сумма векторов: " + sum);
        return sum;
    }

    public static double sum2(Vector[] mas, int i) {
        double sum = (mas[i].x1 * mas[i + 1].x1) + (mas[i].x2 * mas[i + 1].x2) + (mas[i].x3 * mas[i + 1].x3);
        return sum;
    }

    public static double len(Vector[] mas) {
        int i = Int();
        double len = Math.sqrt(Math.pow(mas[i].x1, 2) + Math.pow(mas[i].x2, 2) + Math.pow(mas[i].x3, 2));
        System.out.println("Длина вектора: " + len);
        return len;
    }

    public static double len(Vector[] mas, int i) {
        double len = Math.sqrt(Math.pow(mas[i].x1, 2) + Math.pow(mas[i].x2, 2) + Math.pow(mas[i].x3, 2));
        return len;
    }

    public static void corner(Vector[] mas) {
        int i = Int2();
        double j = Math.cos(mas[i].sum2(mas, i) / (mas[i].len(mas, i) * mas[i + 1].len(mas, i + 1)));
        System.out.println("Угол между векторами: " + j);
    }
}
