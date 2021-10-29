package com.company;

import java.util.Random;
import java.util.Scanner;

public class pr31 {
    public static void main(String args[]) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 31");
        int n, k = 0, j = 0;
        do {
            System.out.println("Введите число");
            while (!sc.hasNextInt()) {
                System.out.println("Введите число ещё раз");
                sc.next();
            }
            n = sc.nextInt();
            if (n > 3) {
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = r.nextInt(n + 1);
                    System.out.print(arr[i] + " ");
                    if (arr[i] % 2 == 0 && arr[i]!=0) k++;
                }
                System.out.println();
                if(k>0) {
                    int arr2[] = new int[k];
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0 && arr[i] != 0) {
                            arr2[j] = arr[i];
                            j++;
                        }
                    }
                    for (int i = 0; i < arr2.length; i++) {
                        System.out.print(arr2[i] + " ");
                    }
                    System.out.println();
                }
            }
        }
        while (n < 4);
    }
}
