package com.company;

import java.util.Scanner;

public class House {
    private int id, number, floor, kol, term, zad, zad2, zad3;
    private String street, type;
    private double square, zad4;

    public int getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public int getFloor() {
        return floor;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public double getSquare() {
        return square;
    }

    public int getKol() {
        return kol;
    }

    public int getTerm() {
        return term;
    }

    //public void setZa(String a){zad=a;}

    public static void vvod(House[] mas, int pr) {
        switch (pr) {
            case 1:
                House.zad1(mas);
                break;
            case 2:
                House.zad2(mas);
                break;
            case 3:
                House.zad3(mas);
                break;
            default:
                System.out.println("Номера такого задания нет");
        }
    }

    public House(int id, int number, double square, int floor, int kol, String street, String type, int term) {
        this.id = id;
        this.square = square;
        this.floor = floor;
        this.kol = kol;
        this.number = number;
        this.street = street;
        this.type = type;
        this.term = term;
    }

    public void show() {
        System.out.println("Id: " + getId() + " Номер дома: " + getNumber() + " Площадь: " + getSquare() + " Этаж: " + getFloor() + " Колличество комнат: " + getKol() + " Улица: " + getStreet() + " Тип здания: " + getType() + " Срок эксплотации: " + getTerm());
    }

    public static House[] createMass(int n) {
        House mas[] = new House[n];
        mas[0] = new House(123456, 1, 200.5, 121, 2, "Беды", "Панельный", 15);
        mas[1] = new House(123484, 2, 2003, 457, 2, "8 марта", "Панельный", 1);
        mas[2] = new House(123484, 3, 20.45, 65, 1, "Бровки", "Панельный", 45);
        mas[3] = new House(123484, 4, 2.4, 4, 3, "Независимости", "Панельный", 9);
        return mas;
    }

    public static void showMas(House[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }

    public void create() {
        System.out.println("Задание 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите определённый колличество комнат");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        zad = sc.nextInt();
    }

    public static void zad1(House[] mas) {
        int ch = 0;
        do {
            mas[0].create();
            do {
                for (int i = 0; i < mas.length; i++) {
                    if (mas[i].kol == mas[0].zad) {
                        mas[i].show();
                        ch++;
                    }
                }
                if (ch == 0) System.out.println("Квартир с таким колличеством комнат нет)");
            } while (mas[0].zad < 1);
        } while (ch == 0);
    }

    public void create2() {
        System.out.println("Задание 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите определённый колличество комнат");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        zad = sc.nextInt();
        System.out.println("Введите интервал этажей в котором будут выводиться квартиры");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        zad2 = sc.nextInt();
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        zad3 = sc.nextInt();
    }

    public static void zad2(House[] mas) {
        int ch = 0;
        do {
            mas[0].create2();
            do {
                for (int i = 0; i < mas.length; i++) {
                    if (mas[i].kol == mas[0].zad && mas[i].floor > mas[0].zad2 && mas[i].floor < mas[0].zad3) {
                        mas[i].show();
                        ch++;
                    }
                }
                if (ch == 0) System.out.println("Квартир с таким колличеством комнат и на таком промежутке нет)");
            } while (mas[0].zad < 1 || mas[0].zad2 < 1 || mas[0].zad3 < 1);
        } while (ch == 0);
    }

    public void create3() {
        System.out.println("Задание 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите площадь");
        while (!sc.hasNextDouble()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        zad4 = sc.nextDouble();
    }

    public static void zad3(House[] mas) {
        int ch = 0;
        do {
            mas[0].create3();
            do {
                for (int i = 0; i < mas.length; i++) {
                    if (mas[i].square > mas[0].zad4) {
                        mas[i].show();
                        ch++;
                    }
                }
                if (ch == 0) System.out.println("Квартир с площадью больше заданной нет)");
            } while (mas[0].zad4 < 1);
        } while (ch == 0);
    }
}
