package com.company;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 3");
        System.out.println("Введите число: ");
        double N = 0;
        while (!sc.hasNextDouble()) {
            System.out.println("Введите ещй раз число: ");
            sc.next();
        }
            N = sc.nextDouble();
        double arr[] = new double[10];
        System.out.println("Массив");
        for (int i = 0; i < 10; i++) {
            arr[i] = N;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
