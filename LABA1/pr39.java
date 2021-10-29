package com.company;

import java.util.Random;
import java.util.Scanner;

public class pr39 {
    public static void main(String args[]) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 38");
        int N, M, k, n = 0, m = 0, p, l;
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
            System.out.println("Введите число ");
            while (!sc.hasNextInt()) {
                System.out.println("Введите число ");
                sc.next();
            }
            k = sc.nextInt();
            if (N > 0 && M > 0 && k > 0 && k <= N && k<= M) {
                int arr[][] = new int[N][M];
                System.out.println("Массив: ");
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        arr[i][j] = r.nextInt(200) - 100;
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                k-=1;
                l = arr[0][0];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        if (l < arr[i][j]) {
                            l = arr[i][j];
                            m = j;
                            n = i;
                        }
                    }
                }
                for (int i = 0; i < N; i++) {
                    p = arr[i][k];
                    arr[i][k] = arr[i][m];
                    arr[i][m] = p;
                }
                for (int i = 0; i < M; i++) {
                    p = arr[k][i];
                    arr[k][i] = arr[n][i];
                    arr[n][i] = p;
                }
                System.out.println("Массив: ");
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        while (N < 1 || M < 1 || k < 1 || k > N || k > M);
    }
}
