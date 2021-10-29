package com.company;

import java.util.Random;
import java.util.Scanner;

public class pr32 {
    public static void main(String args[]) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 32");
        int arr[][] = new int[6][7];
        System.out.println("Массив: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = r.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int k = arr[0][0], l = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (k <= arr[i][j]) {
                    l = k;
                    k = arr[i][j];
                    arr[i][j] = l;
                }
                arr[i][0] = k;
            }
        }
            System.out.println("Изменённый массив:");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
        }
    }
}
