package com.company;

import java.util.Scanner;

public class pr15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//pr20
        System.out.println("Задание 15");
        System.out.print("Числа Фибоначчи: ");
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b);
        for (int i = 0; i < 4; i++) {
            a = a + b;
            b = a + b;
            System.out.print(" " + a + " " + b);
        }
        a = a + b;
        System.out.print(" " + a);
        System.out.println();
    }
}


