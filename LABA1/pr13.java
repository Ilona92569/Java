package com.company;

import java.util.Scanner;

public class pr13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //pr18
        System.out.println("Задание 13");
        int n = 0;
        do {
            System.out.println("Введите число");
            while (!sc.hasNextInt()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            n = sc.nextInt();
            if (n > 0) {
                System.out.println("Делители числа " + n + ": ");
                for (int i = 1; i < 10000000; i++) {
                    if (n % i == 0) System.out.print(i + " ");
                }
            }
        } while (n < 1);
    }
}
