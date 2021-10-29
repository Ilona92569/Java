package com.company;

import java.util.Scanner;

public class pr3 {
    public static void main(String args[]) {
        //pr8
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 3");
        System.out.println("Введите два разных числа");
        double k = 0;
        double p = 0;
        do {
            System.out.println("Введите первое число");
            while (!sc.hasNextDouble()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            k = sc.nextDouble();
            System.out.println("Введите второе число");
            while (!sc.hasNextDouble()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            p = sc.nextDouble();
            if (k > p) {
                double sum = (k + p) / 2;
                double pr = k * p * 2;
                p = sum;
                k = pr;
            }
            if (k<p) {
                double sum = (k + p) / 2;
                double pr = k * p * 2;
                k = sum;
                p = pr;
            }
            if (k==p) System.out.println("Вы ввели одинаковые числа");
        }
        while (k == p);
        System.out.println(k + " " + p);
    }

}
