package com.company;

import java.util.Random;
import java.util.Scanner;

public class pr40 {
    public static void main(String args[]) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 40");
        int N;
        do {
            System.out.println("Введите размер матрица N");
            while (!sc.hasNextInt()) {
                System.out.println("Введите размер матрица N");
                sc.next();
            }
            N = sc.nextInt();
            if (N > 0) {
                int arr[][] = new int[N][N];
                System.out.println("Массив: ");
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        arr[i][j] = r.nextInt(200) - 100;
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Массив: ");
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (arr[i][j] > 0) arr[i][j] = 1;
                        if (arr[i][j] < 0) arr[i][j] = 0;
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        while (N < 1);
    }
}
