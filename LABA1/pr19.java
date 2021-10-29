package com.company;

import java.util.Random;
import java.util.Scanner;

public class pr19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //pr24
        System.out.println("Задание 19");
        Random r = new Random();
        int n, k = 0;
        n = r.nextInt(151) + 5;
        for (int i = 26; i < 100; i++) {
            if (n == i) System.out.println("Число " + n + " содержится в интервале (25,100)");
            else k++;
        }
        if (k > 73) System.out.println("Число " + n + " не содержится в интервале (25,100)");
        //pr25
        System.out.println("Задание 20");
        n = r.nextInt(900) + 100;
        int n1, n2, n3, l;
        l = n;
        n1 = n % 10;
        n = n / 10;
        n2 = n % 10;
        n = n / 10;
        n3 = n % 10;
        n = n / 10;
        if (n1 >= n2 && n1 >= n3) System.out.println("В числе " + l + " наибольшая цифра " + n1);
        if (n2 > n1 && n2 >= n3) System.out.println("В числе " + l + " наибольшая цифра " + n2);
        if (n3 > n1 && n3 > n2) System.out.println("В числе " + l + " наибольшая цифра " + n3);
        //pr26
        System.out.println("Задание 21");
        n=r.nextInt(28801);
        k=n/3600;
        if (k>4 && k<9) {
            System.out.println(n);
            System.out.println("Осталось "+k+" часов");
        }
        if (k<5 && k>1) {
            System.out.println(n);
            System.out.println("Осталось "+k+" часа");
        }
        if (k==1) {
            System.out.println(n);
            System.out.println("Остался "+k+" час");
        }
        if (k==0){
            System.out.println(n);
            System.out.println("Осталось менее часа");
        }
    }
}
