package com.company;

import java.util.Scanner;

public class Abituriet {
    private int id, zad;
    private double zad2, zad3;
    private String fio, number, address;
    public int arr[] = new int[10];

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }


    //public void setZa(String a){zad=a;}
    public static void vvod(Abituriet[] mas, int pr) {
        switch (pr) {
            case 1:
                Abituriet.zad1(mas);
                break;
            case 2:
                Abituriet.zad2(mas);
                break;
            case 3:
                Abituriet.zad3(mas);
                break;
            default:
                System.out.println("Номера такого задания нет");
        }
    }

    public Abituriet(int id, String fio, String address, String number, int... a) {
        this.id = id;
        this.fio = fio;
        this.address = address;
        this.number = number;
        this.arr = a;
    }

    public void show() {
        System.out.print("Id: " + getId() + " ФИО: " + getFio() + " Адрес: " + getAddress() + " Телефон: " + getNumber() + " Оценки: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static Abituriet[] createMass(int n) {
        Abituriet mas[] = new Abituriet[n];
        mas[0] = new Abituriet(123456, "Сосна Илона Александровна", "ул. Л.Беды, дом 4 корпус 1", "80336559392", 5, 6, 4, 5, 7, 8, 9, 5, 7, 10);
        mas[1] = new Abituriet(123484, "Песецкая Анна Алексеевна", "ул. Л.Беды, дом 4 корпус 1", "80294671525", 5, 2, 4, 5, 7, 8, 9, 5, 7, 10);
        mas[2] = new Abituriet(123484, "Песецкая Анна Алексеевна", "ул. Л.Беды, дом 4 корпус 1", "80294671525", 2, 6, 4, 5, 1, 1, 9, 5, 7, 10);
        mas[3] = new Abituriet(123484, "Песецкая Анна Алексеевна", "ул. Л.Беды, дом 4 корпус 1", "80294671525", 2, 6, 4, 5, 10, 10, 10, 10, 10, 10);
        return mas;
    }

    public static void showMas(Abituriet[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }

    public void create2() {
        System.out.println("Задание 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите средний балл");
        while (!sc.hasNextDouble()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        zad3 = sc.nextDouble();
    }

    public void create3() {
        System.out.println("Задание 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество студентов");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        zad = sc.nextInt();

    }

    public static void zad1(Abituriet[] mas) {
        System.out.println("Задание 1");
        int ch = 0;
        int k = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (mas[i].arr[j] < 3) {
                    ch++;
                    k++;
                }
            }
            if (k > 0) {
                mas[i].show();
                k = 0;
            }
        }
        if (ch == 0) System.out.println("Абитуриентов с неудовлетворительнными оценками нет)");
    }

    public static void zad2(Abituriet[] mas) {
        int ch = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i].zad2 = 0;
            for (int j = 0; j < 10; j++) {
                mas[i].zad2 += mas[i].arr[j];
            }
            mas[i].zad2 = mas[i].zad2 / 10;
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i].zad2);
        }
        do {
            mas[0].create2();
            if (mas[0].zad3 >= 0) {
                for (int i = 0; i < mas.length; i++) {
                    if (mas[0].zad3 < mas[i].zad2) {
                        mas[i].show();
                        ch++;
                    }
                }
            }
            if (ch == 0) System.out.println("Абитуриентов со среднем баллом выше заданного нет)");
        } while (mas[0].zad3 < 0);
    }

    public static void zad3(Abituriet[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].zad2 = 0;
            for (int j = 0; j < 10; j++) {
                mas[i].zad2 += mas[i].arr[j];
            }
            mas[i].zad2 = mas[i].zad2 / 10;
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i].zad2);
        }
        do {
            mas[0].create3();
            if (mas[0].zad > 0) {
                int kl = 0;
                System.out.println(mas[0].zad + " абитуриентов с наивышиим средним баллом: ");
                do {
                    double ch = mas[0].zad2;
                    int k = 0;
                    for (int i = 0; i < mas.length; i++) {
                        if (ch < mas[i].zad2) {
                            ch = mas[i].zad2;
                            k = i;
                        }
                    }
                    mas[k].zad2 = 0;
                    mas[k].show();
                    kl++;
                } while (kl != mas[0].zad);
                double ch = mas[0].zad2;
                int k = 0;
                for (int i = 0; i < mas.length; i++) {
                    if (ch < mas[i].zad2) {
                        ch = mas[i].zad2;
                        k = i;
                    }
                }
                System.out.println("Абитуриенты с полупроходнным баллом " + ch);
                for (int i = 0; i < mas.length; i++) {
                    if (ch == mas[i].zad2) {
                        mas[i].show();
                    }
                }

            }
        } while (mas[0].zad < 1);
    }
}
