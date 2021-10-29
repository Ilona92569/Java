package com.company;
import java.util.Scanner;

public class pr7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //pr12
        System.out.println("Задание 7");
        int q = 0;
        q = (int) (Math.random() * 9 + 1);
        int n = 0;
        do {
            System.out.println("Угадайте число");
            while (!sc.hasNextInt()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            n = sc.nextInt();
            if (n > q) System.out.println("Число меньше");
            if (n<q) System.out.println("Число больше");
        } while (n != q);
        System.out.println("Угадали! Число:" + n);
    }
}
