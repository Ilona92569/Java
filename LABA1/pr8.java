package com.company;

import java.util.Scanner;

public class pr8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //pr13
        System.out.println("Задание 8");
        for (int i=1000; i<10000; i+=3)
            System.out.print(i+" ");
        System.out.println();
        //pr14
        System.out.println("Задание 9");
        int n=1;
        System.out.print(n+" ");
        for (int i=0; i<54; i++) {
            n=n+2;
            System.out.print(n + " ");
        }
        System.out.println();
        //pr15
        System.out.println("Задание 10");
        for (int i=90; i>-1; i-=5) {
            System.out.print(i+" ");
        }
        System.out.println();
        //pr16
        System.out.println("Задание 11");
        for (int a=2; a<=10000; a=2*a-1){
            System.out.print(a+" ");
        }
        System.out.println();
        //pr17
        System.out.println("Задание 12");
        for (int a=-166; a<=10000; a=2*a+200){
            if (a>9 && a<100)
                System.out.print(a+" ");
        }
        System.out.println();
    }
}
