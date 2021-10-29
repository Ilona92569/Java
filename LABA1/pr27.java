package com.company;

import java.util.Random;
import java.util.Scanner;

public class pr27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        //pr32
        System.out.println("Задание 27");
        int arr7[] = new int[10];
        int arr8[] = new int[10];
        double arr9[] = new double[10];
        int k=0;
        for (int i = 0; i < 10; i++) {
            arr7[i] = r.nextInt(9) + 1;
            System.out.print(arr7[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            arr8[i] = r.nextInt(9) + 1;
            System.out.print(arr8[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            arr9[i] = (double) arr7[i] / arr8[i];
            System.out.print(arr9[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (arr9[i] % 1 == 0) k++;
        }
        System.out.println("Колличество целых элементов третьего массива: "+k);
        //pr33
        System.out.println("Задание 28");
        int arr10[]=new int[11];
        k=0;
        int m=0, l=0;
        for (int i=0; i<11; i++) {
            arr10[i] = r.nextInt(3) -1;
            System.out.print(arr10[i] + " ");
        }
        System.out.println();
        for (int i=0; i<11;i++){
            if(arr10[i]==-1) k++;
            if(arr10[i]==0) m++;
            if(arr10[i]==1) l++;
        }
        if(k>=m && k>=l) System.out.println("-1 больше");
        if(l>=m && l>k) System.out.println("1 больше");
        if(m>k && m>l) System.out.println("0 больше");
    }
}
