package com.company;

import java.util.Scanner;

public class pr16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //pr21
        System.out.println("Задание 16");
        System.out.println("Введите число: ");
        int n = 0, k = 0, sum = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Введите число ещё раз");
            sc.next();
        }
        n = sc.nextInt();
        for (int i = 1; i < 100; i++) {
            if (n < 10 && n > 0) {
                k = n % 10;
                n = n / 10;
                sum = sum + k;
            } else {
                k = n % 10;
                n = n / 10;
                sum = sum + k;
            }
        }
        System.out.println("Сумма цифр: " + sum);
    }
}
