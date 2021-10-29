package com.company;

import java.util.Random;
import java.util.Scanner;

public class pr36 {
    public static void main(String args[]) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 36");
        int N, M;
        do {
            System.out.println("Введите размер матрица N");
            while (!sc.hasNextInt()) {
                System.out.println("Введите размер матрица N");
                sc.next();
            }
            N = sc.nextInt();
            System.out.println("Введите номер строки");
            while (!sc.hasNextInt()) {
                System.out.println("Введите номер строки");
                sc.next();
            }
            M = sc.nextInt();
            if (N > 0 && M > 0 && M < N) {
                System.out.println("Массив: ");
                int arr[][] = new int[N][N];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        arr[i][j] = r.nextInt(200) - 100;
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                int k = arr[0][0], l = 0, m;
                for (int i = 1; i < N; i++) {
                    if (arr[i][i] > k) {
                        k = arr[i][i];
                        l = i;
                    }
                }
                for (int j = 0; j < N; j++) {
                    m = arr[l][j];
                    arr[l][j] = arr[M-1][j];
                    arr[M-1][j] = m;
                }
                System.out.println("Массив: ");
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        while (N < 1 || M < 1 || M > N-1);
    }
}
