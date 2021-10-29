package com.company;
import java.util.Scanner;

public class pr2 {
    public static void main(String args[]) {
        //pr2
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 2.1");

        int N = 0;
        do{
            System.out.println("Введите число в котором сумма первых двух цифр будет равна сумме вторых двух цифр");
            while (!sc.hasNextInt()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            N=sc.nextInt();
            if (N>999 && N<10000) {
                int l=N;
                int b = 0;
                b = b + l % 10;
                l = l / 10;
                b = b + l % 10;
                l = l / 10;
                int c = 0;
                c = c + l % 10;
                l = l / 10;
                c = c + l % 10;
                l = l / 10;
                if (b == c) System.out.println("true");
                else System.out.println("false");
            }
        } while (N > 9999 || N < 1000);
        //pr3
        System.out.println("Задание 2.2");
        int l = 0;
        do{
            System.out.println("Введите число в котором сумма цифр трёхзначнного числа будет чётной");
            while (!sc.hasNextInt()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            l=sc.nextInt();
            if (l > 99 && l < 1000) {
                N=l;
                int b = 0;
                b = b + N % 10;
                N = N / 10;
                b = b + N % 10;
                N = N / 10;
                b = b + N % 10;
                N = N / 10;
                if (b % 2 == 0) System.out.println("true");
                else System.out.println("false");
            }
        } while (l > 999 || l < 100);
        //pr4
        System.out.println("Задание 2.3");
        l = 0;
        do {
            System.out.println("Введите чётное двухзначнное число");
            while (!sc.hasNextInt()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            N = sc.nextInt();
            if (N > 9 && N < 100) {
                if (N % 2 == 0) System.out.println("true");
                else System.out.println("false");
            }
        }
        while (N<10 || N>99);
        //pr5
        System.out.println("Задание 2.4");
        System.out.println("Введите три числа Пифогора");
        double a = 0, b = 0, c = 0;
        System.out.println("Введите первое число");
        while (!sc.hasNextDouble()) {
            System.out.println("Введите число ещё раз");
            sc.next();
        }
        a=sc.nextDouble();
        System.out.println("Введите второе число");
        while (!sc.hasNextDouble()) {
            System.out.println("Введите число ещё раз");
            sc.next();
        }
        b=sc.nextDouble();
        System.out.println("Введите третье число");
        while (!sc.hasNextDouble()) {
            System.out.println("Введите число ещё раз");
            sc.next();
        }
        c=sc.nextDouble();
        if ((int) Math.pow(c, 2) == (int) Math.pow(a, 2) + (int) Math.pow(b, 2)) System.out.println("true");
        else System.out.println("false");
        //pr6
        System.out.println("Задание 2.5");
        l = 0;
        do {
            System.out.println("Введите четырёхзначнное число в котором все цифры различны");
            while (!sc.hasNextInt()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            l = sc.nextInt();
            if (l > 999 && l < 10000) {
                N=l;
                b = 0;
                b = b + N % 10;
                N = N / 10;
                a = 0;
                a = a + N % 10;
                N = N / 10;
                c = 0;
                c = c + N % 10;
                N = N / 10;
                int d = 0;
                d = d + N % 10;
                N = N / 10;
                if (a != b && b != c && c != d && a != c && a != d && b != d) System.out.println("true");
                else System.out.println("false");
            }
        }
        while (l > 9999 || l < 1000);
        //pr7
        System.out.println("Задание 2.6");
        l = 0;
        do{
            System.out.println("Введите четырёхзначнное число в которое с двух сторон считается одинаково");
            while (!sc.hasNextInt()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            l=sc.nextInt();
            if (l > 999 && l < 10000) {
                N=l;
                a = 0;
                a = a + N % 10;
                N = N / 10;
                b = 0;
                b = b + N % 10;
                N = N / 10;
                c = 0;
                c = c + N % 10;
                N = N / 10;
                int d = 0;
                d = d + N % 10;
                N = N / 10;
                if (a == d && b == c) System.out.println("true");
                else System.out.println("false");
            }
        }
        while (l > 9999 || l < 1000);
    }
}
