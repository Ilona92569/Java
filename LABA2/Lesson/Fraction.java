package zad_2;

import java.util.Scanner;

public class Fraction {
    public int m, n;

    public Fraction() {
    }

    public Fraction(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public static Fraction[] createMass(int n) {
        Fraction mas[] = new Fraction[n];
        mas[0] = new Fraction(5, 101);
        mas[1] = new Fraction(14, 8);
        mas[2] = new Fraction(556, 18);
        mas[3] = new Fraction(11, 17);
        return mas;
    }

    public static void vvod(Fraction[] mas, int pr) {
        switch (pr) {
            case 1:
                Fraction.showMas(mas);
                break;
            case 2:
                System.out.println(Fraction.sum(mas));
                System.out.println(Fraction.raz(mas));
                System.out.println(Fraction.ymn(mas));
                System.out.println(Fraction.del(mas));
                Fraction.cok(mas);
                break;
            case 3:
                System.out.println(Fraction.sum(mas, 0, 2));
                System.out.println(Fraction.raz(mas, 1, 3));
                break;
            case 4:
                Fraction.zad();
                break;
            case 5:
                Fraction.zad2(mas);
                break;
            default:
                System.out.println("Номера такого задания нет");
        }
    }

    public static int Int() {
        int i;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите номер первой дроби");
            while (!sc.hasNextInt()) {
                System.out.println("Введите ещё раз");
                sc.next();
            }
            i = sc.nextInt();
        } while (i > 3 || i < 0);
        return i;
    }

    public static int Int2() {
        int j;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите номер второй дроби");
            while (!sc.hasNextInt()) {
                System.out.println("Введите ещё раз");
                sc.next();
            }
            j = sc.nextInt();
        } while (j > 3 || j < 0);
        return j;
    }

    public static int Int3() {
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество дробей");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        j = sc.nextInt();
        return j;
    }

    public void show() {
        System.out.println(m);
        System.out.println("-");
        System.out.println(n);
        System.out.println();
    }

    public static void showMas(Fraction[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }

    public static double sum(Fraction[] mas) {
        double sum = 0;
        int i = Int();
        int j = Int2();
        sum = ((double) mas[i].m / mas[i].n) + ((double) mas[j].m / mas[j].n);
        return sum;
    }

    public static double raz(Fraction[] mas) {
        double raz = 0;
        int i = Int();
        int j = Int2();
        raz = ((double) mas[i].m / mas[i].n) - ((double) mas[j].m / mas[j].n);
        return raz;
    }

    public static double ymn(Fraction[] mas) {
        double ymn = 0;
        int i = Int();
        int j = Int2();
        ymn = ((double) mas[i].m / mas[i].n) * ((double) mas[j].m / mas[j].n);
        return ymn;
    }

    public static double del(Fraction[] mas) {
        double del = 0;
        int i = Int();
        int j = Int2();
        del = ((double) mas[i].m / mas[i].n) / ((double) mas[j].m / mas[j].n);
        return del;
    }

    public static void cok(Fraction[] mas) {
        double del = 0;
        int i = Int();
        for (int j = 2; j <= mas[i].m || j < mas[i].n; j++) {
            if (mas[i].m % j == 0 && mas[i].n % j == 0) {
                mas[i].m = mas[i].m / j;
                mas[i].n = mas[i].n / j;
            }
        }
        mas[i].show();
    }

    public static void cok2(Fraction[] mas, int i) {
        for (int j = 2; j <= mas[i].m || j < mas[i].n; j++) {
            if (mas[i].m % j == 0 && mas[i].n % j == 0) {
                mas[i].m = mas[i].m / j;
                mas[i].n = mas[i].n / j;
            }
        }
    }

    public static double sum(Fraction[] mas, int... a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += ((double) mas[i].m / mas[i].n);
        }
        return sum;
    }

    public static double raz(Fraction[] mas, int... a) {
        double raz = (mas[a[0]].m / mas[a[0]].n);
        for (int i = 1; i < a.length; i++) {
            raz -= ((double) mas[i].m / mas[i].n);
        }
        return raz;
    }

    public static void zad() {
        System.out.println("Введите дроби");
        Scanner sc = new Scanner(System.in);
        int k = Int3();
        int arr[][] = new int[k][2];
        for (int i = 0; i < k; i++) {
            System.out.println("Введите числитель");
            while (!sc.hasNextInt()) {
                System.out.println("Ещё раз");
                sc.next();
            }
            arr[i][0] = sc.nextInt();
            System.out.println("Введите знаминатель");
            while (!sc.hasNextInt()) {
                System.out.println("Ещё раз");
                sc.next();
            }
            arr[i][1] = sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i][0]);
            System.out.println("-");
            System.out.println(arr[i][1]);
        }
    }

    public static void zad2(Fraction[] mas) {
        int l = 0, o = 0;
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                o = mas[i].n * mas[i + 1].n;
                mas[i].m = mas[i].m * mas[i + 1].n;
                l = mas[i + 1].m * mas[i].n;
                mas[i].m = mas[i].m + l;
                mas[i].n = o;
                cok2(mas, i);
            }
        }
        showMas(mas);
    }
}

