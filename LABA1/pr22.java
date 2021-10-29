package com.company;

import java.util.Random;
import java.util.Scanner;

public class pr22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        //pr27
        System.out.println("Задание 22");
        int arr[] = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = r.nextInt(10) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < 8; i += 2) {
            arr[i] = 0;
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //pr28
        System.out.println("Задание 23");
        int arr2[] = new int[5];
        int arr3[] = new int[5];
        double sum2 = 0, sum3 = 0;
        for (int i = 0; i < 5; i++) {
            arr2[i] = r.nextInt(6);
            System.out.print(arr2[i] + " ");
            sum2 = sum2 + arr2[i];
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            arr3[i] = r.nextInt(6);
            System.out.print(arr3[i] + " ");
            sum3 = sum3 + arr3[i];
        }
        System.out.println();
        sum2 = sum2 / 5;
        sum3 = sum3 / 5;
        if (sum2 > sum3) System.out.println("Первый массив больше. Его среднее арифметическое: " + sum2);
        else System.out.println("Второй массив больше. Его среднее арифметическое: " + sum3);
        if (sum2 == sum3) ;
        //pr29
        System.out.println("Задание 24");
        int arr4[] = new int[4];
        int m = 0, k = 0;
        for (int i = 0; i < 4; i++) {
            arr4[i] = r.nextInt(90) + 10;
            System.out.print(arr4[i] + " ");
        }
        System.out.println();
        k = arr4[0];
        for (int i = 1; i < 4; i++) {
            if (k < arr4[i]) m++;
            k = arr4[i];
        }
        if (m == 3) System.out.println("Массив является строго возрастающей последовательностью");
        else System.out.println("Массив не является строго возрастающей последовательностью");
        //pr30
        System.out.println("Задание 25");
        int arr5[] = new int[20];
        arr5[0] = 1;
        arr5[1] = 1;
        for (int i = 2; i < 20; i++) {
            arr5[i] = arr5[i - 1] + arr5[i - 2];
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(arr5[i] + " ");
        }
        System.out.println();
        //pr31
        System.out.println("Задание 26");
        int arr6[] = new int[12];
        for (int i = 0; i < 12; i++) {
            arr6[i] = r.nextInt(30) - 15;
            System.out.print(arr6[i] + " ");
        }
        System.out.println();
        k = arr6[0];
        m = 0;
        for (int i = 0; i < 12; i++) {
            if (arr6[i] >= k) {
                k = arr6[i];
                m = i;
            }
        }
        System.out.println("Самый максимальный элемент - " + k + ", под индексом " + m);
    }
}
