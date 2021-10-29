package com.company;
import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

public class pr29 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = 0, sum1 = 0, sum2 = 0;
        do {
            System.out.println("Введите положительное чётное число");
            while (!sc.hasNextInt()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            n = sc.nextInt();
            if (n > 0 && n % 2 == 0) {
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = r.nextInt(11)-5;
                    System.out.print(arr[i] + " ");
                }
                System.out.println(" ");
                for (int i = 0; i < n / 2; i++) {
                    sum1 = sum1 + arr[i];
                }
                for (int i = n / 2; i < n; i++) {
                    sum2 = sum2 + arr[i];
                }
                if (abs(sum1) > abs(sum2)) System.out.println("Сумма первой половина больше. Сумма: " + abs(sum1));
                if (abs(sum1) < abs(sum2)) System.out.println("Сумма второй половина больше. Сумма: " + abs(sum2));
                if (abs(sum1) == abs(sum2)) System.out.println("Сумма двух половин одинаковая. Сумма: " + abs(sum1));
            }
        }
        while (n < 0 || n % 2 != 0);
    }
}
