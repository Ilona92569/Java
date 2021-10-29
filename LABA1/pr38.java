package com.company;

import java.util.Random;
import java.util.Scanner;

public class pr38 {
    public static void main(String args[]) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 38");
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
                    for (int j = 0; j < N; j++) { arr[i][j] = r.nextInt(200) - 100;
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                int sum[][] = new int[2][N];
                    for (int i = 0; i < N; i++) {
                        for (int j = 0; j < N; j++) {
                            sum[0][i] += arr[i][j];
                        }
                    }
                    for (int i = 0; i < N; i++) {
                        for (int j = 0; j < N; j++) {
                            sum[1][i] += arr[j][i];
                        }
                    }
                int k = 0;
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < N-1; j++) {
                        if (sum[i][j] != sum[i][j + 1]) {
                            k++;
                        }
                    }
                }
                if (k == 0) System.out.println("Является магической");
                if (k>0) System.out.println("Не является магической");
            }
        }
        while (N < 1);
    }
}

