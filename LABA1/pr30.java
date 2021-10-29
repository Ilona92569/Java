package com.company;

import java.util.Random;

public class pr30 {
    public static void main(String args[]) {
        Random r = new Random();
        System.out.println("Задание 30");
        int arr[] = new int[12];
        int n = 6, m = 6, l, i = 0;
        do {
            l = r.nextInt(20) - 10;
            if (l > 0 && l < 11 && n>0) {
                arr[i] = l;
                i++;
                n--;
            }
            if (l < 0 && l > -11 && m>0) {
                arr[i] = l;
                i++;
                m--;
            }
        } while (m > 0 || n > 0);
        for (i=0; i<12; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
