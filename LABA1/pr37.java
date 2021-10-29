package com.company;

import java.util.Random;
import java.util.Scanner;

public class pr37 {
    public static void main(String args[]) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 37");
        int N, M, p, m;
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
                System.out.println("Массив: ");
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        arr[i][j] = r.nextInt(200) - 100;
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                int min[] = new int[N];
                int max[] = new int[N];
                int k[] = new int[N];
                int l[] = new int[N];

                for (int i = 0; i < N; i++) {
                    max[i] = arr[i][0];
                    min[i] = arr[i][0];
                    k[i]=0;
                    l[i]=0;
                }
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        if (arr[i][j] > max[i]) {
                            max[i] = arr[i][j];
                            k[i]=j;
                        }
                        if (arr[i][j] < min[i]) {
                            min[i] = arr[i][j];
                            l[i]=j;
                        }
                    }
                }
                for (int i = 0; i < N; i++) {
                    p = arr[i][0];
                    m = arr[i][M-1];
                    if(k[i]==0 && l[i]==M-1) {
                        arr[i][0] = m;
                        arr[i][M - 1] = p;
                    }
                    if(k[i]!=0 || l[i]!=M-1) {
                        arr[i][0] = max[i];
                        arr[i][k[i]] = p;
                        arr[i][M - 1] = min[i];
                        arr[i][l[i]] = m;
                    }
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
        while (N < 1 || M < 1);
    }
}
