package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //pr1
        System.out.println("Задание 1");
        double n = 0, k = 0, l = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Введите ещё раз первое число: ");
            sc.next();
        }
        n = sc.nextDouble();
        System.out.println("Введите второе число: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Введите ещё раз второе число: ");
            sc.next();
        }
        k = sc.nextDouble();
        System.out.println("Введите третье число: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Введите ещё раз третье число: ");
            sc.next();
        }
        l = sc.nextDouble();
        System.out.println("Введённые числа " + n + " " + k + " " + l);
        if (n > k && n > l) System.out.println("Большее число " + n);
        if (n < k && n < l) System.out.println("Меньшее число " + n);
        if (k > n && k > l) System.out.println("Большее число " + k);
        if (k < n && k < l) System.out.println("Меньшее число " + k);
        if (l > n && l > k) System.out.println("Большее число " + l);
        if (l < n && l < k) System.out.println("Меньшее число " + l);
    }
}
