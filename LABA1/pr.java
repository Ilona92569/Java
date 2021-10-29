package com.company;
import java.util.Scanner;

public class pr {
    public static void main(String args[]) {
        //pr1
        double n;
        System.out.println("Задание 1");
        System.out.println("Введите число n");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            System.out.println("Введите число ещё раз");
            sc.next();
        }
        n = sc.nextDouble();
        System.out.println(n);
        for (int i = 1; i < 5; i++) {
            double b = (double) Math.pow(n, i);
            System.out.println(b);
        }
    }
}
