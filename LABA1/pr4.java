package com.company;

import java.util.Scanner;

public class pr4 {
    public static void main(String args[]) {
        //pr9
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 4");
        int n = 0;
        int par = 6587;

        do {
            System.out.println("Введите пароль:");
            while (!sc.hasNextInt()) {
                System.out.println("Введите ещё раз");
                sc.next();
            }
                n = sc.nextInt();
                if (n != par)
                    System.out.println("Вы ввели неправильный пароль ");
        }
        while (n != par);
        System.out.println("Пароль введён верно");
    }
}

