package com.company;

import java.util.Random;

public class pr33 {
    public static void main(String args[]) {
        Random r = new Random();
        System.out.println("Задание 33");
        int arr[] = new int[15];
        int arr1[] = new int[15];
        int n = 0, k = 0, l = 0, a = 0, s = 0;
        for (int i = 0; i < 15; i++) {
            arr[i] = r.nextInt(8) + 2;
            arr1[i] = r.nextInt(8) + 2;
        }
        for (int i=0; i<14; i++){
            n=arr[i]; k=arr1[i];
            for(int j=i+1; j<15; j++){
                if (n==arr[j] && k==arr1[j]) {
                    arr[j] = r.nextInt(8) + 2;
                    arr1[j] = r.nextInt(8) + 2;
                }
                if (n==arr1[j] && k==arr[j]) {
                    arr[j] = r.nextInt(8) + 2;
                    arr1[j] = r.nextInt(8) + 2;
                }
            }
        }
        for (int i=0; i<14; i++){
            n=arr[i]; k=arr1[i];
            for(int j=i+1; j<15; j++){
                if (n==arr[j] && k==arr1[j]) {
                    arr[j] = r.nextInt(8) + 2;
                    arr1[j] = r.nextInt(8) + 2;
                }
                if (n==arr1[j] && k==arr[j]) {
                    arr[j] = r.nextInt(8) + 2;
                    arr1[j] = r.nextInt(8) + 2;
                }
            }
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(arr[i] + "*" + arr1[i]);
        }
    }
}
