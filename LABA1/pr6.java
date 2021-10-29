package com.company;


import java.util.Scanner;

public class pr6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //pr11
        System.out.println("Задание 6");
        int n = 0;
        do {
            System.out.println("Введите число n от 1 до 4");
            while (!sc.hasNextInt()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            n = sc.nextInt();
            System.out.println("Введите число q, которое будет кратно числам");
            double q = 0;
            while (!sc.hasNextDouble()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            q = sc.nextDouble();
            int sum = 0;
            if (n >= 1 && n <= 4) {
                if (n == 1) {
                    for (int i = 0; i < 10; i++) {
                        if (i % q == 0) {
                            sum = sum + i;
                        }
                    }
                }
                if (n == 2) {
                    for (int i = 10; i < 100; i++) {
                        if (i % q == 0) {
                            sum = sum + i;
                        }
                    }
                }
                if (n == 3) {
                    for (int i = 100; i < 1000; i++) {
                        if (i % q == 0) {
                            sum = sum + i;
                        }
                    }
                }
                if (n == 4) {
                    for (int i = 1000; i < 10000; i++) {
                        if (i % q == 0) {
                            sum = sum + i;
                        }
                    }
                }
                System.out.println("Сумма: " + sum);
            }
        }
        while (n < 1 || n > 4);
    }
}