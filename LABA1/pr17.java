package com.company;

import java.util.Scanner;

public class pr17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //pr22
        System.out.println("Задание 17");
        int m = 0, k = 0, n = 0, kol = 0, l = 0;
        for (n = 1001; n < 1000000; n++) {
            l = n;
            for (int i = 1; i < 4; i++) {
                k = k + (l % 10);
                l = l / 10;
            }
            for (int i = 1; i < 4; i++) {
                m = m + (l % 10);
                l = l / 10;
            }
            if (k == m) kol++;
            m = 0;
            k = 0;
        }
        System.out.println("Колличество счастливых билетов: " + kol);
        //pr23
        System.out.println("Задание 18");
        k = 0;
        m = 0;
        kol = 0;
        for (n = 1; n < 100000; n++) {
            l = n;
            for (int i = 1; i < 6; i++) {
                k = n % 10;
                m = n % 100;
                l = l / 10;
                if (k == 4 || m == 13) kol++;
            }
        }
        System.out.println("Колличество таких чисел: " + kol);
    }
}
