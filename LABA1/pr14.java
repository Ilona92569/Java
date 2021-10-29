package com.company;

import java.util.Scanner;

public class pr14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //pr19
        System.out.println("Задание 14");
        int n = 0, k = 0, q = 0;
        do {
            System.out.println("Введите число");
            while (!sc.hasNextInt()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            n = sc.nextInt();
            if (n > 1) {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        System.out.print("Число не простое. Его простые делители: ");
                        break;
                    } else k++;
                }
                for (int i = 2; i <= (double) Math.sqrt(n); i++) {
                    for (int j = 2; j <= n; j++) {
                        if (n % i == 0) {
                            if (i % j == 0) q++;
                        }
                    }
                    if (q == 1) System.out.print(i + " ");
                    q = 0;
                }
            }
            if (k == n - 2) System.out.println("Число простое");
            System.out.println();
        }
        while (n < 2);
    }
}
