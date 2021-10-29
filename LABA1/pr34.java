package com.company;

import java.util.Random;
import java.util.Scanner;

public class pr34 {
    public static void main(String args[]) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 34");
        int N, M, sum = 0, kol = 0;
        do {
            System.out.println("Введите размер матрица N");
            while (!sc.hasNextInt()) {
                System.out.println("Введите размер матрица N");
                sc.next();
            }
            N = sc.nextInt();
            System.out.println("Введите размер матрица M");
            while (!sc.hasNextInt()) {
                System.out.println("Введите размер матрица M");
                sc.next();
            }
            M = sc.nextInt();
            if (N > 0 && M > 0) {
                int arr[][] = new int[N][M];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        arr[i][j] = r.nextInt(200) - 100;
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                for (int i = 0; i < N; i++) {
                    for (int j = i; j < M; j++) {
                        if (arr[i][j] > 0) {
                            sum += arr[i][j];
                            kol++;
                        }
                    }
                }
                System.out.println("Сумма положительнных элементов: " + sum + ". Колличество: " + kol);
            }
        }
        while (N < 1 || M < 1);
    }
}
