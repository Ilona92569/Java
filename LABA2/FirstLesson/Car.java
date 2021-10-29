package com.company;

import java.util.Scanner;

public class Car {
    private int id, year, number, price, zad2, zad3, srok;
    private String marka, modele, color, zad;
    private double zad4;

    public int getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public int getYear() {
        return year;
    }

    public String getModele() {
        return modele;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    //public void setZa(String a){zad=a;}

    public static void vvod(Car[] mas, int pr) {
        switch (pr) {
            case 1:
                Car.zad1(mas);
                break;
            case 2:
                Car.zad2(mas);
                break;
            case 3:
                Car.zad3(mas);
                break;
            default:
                System.out.println("Номера такого задания нет");
        }
    }

    public Car(int id, String marka, String modele, int year, String color, int price, int number) {
        this.id = id;
        this.marka = marka;
        this.modele = modele;
        this.year = year;
        this.number = number;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    public void show() {
        System.out.println("Id: " + getId() + " Марка: " + getMarka() + " Модель: " + getModele() + " Год выпуска: " + getYear() + " Цвет: " + getColor() + " Цена: " + getPrice() + " Регистрационный номер: " + getNumber());
    }

    public static Car[] createMass(int n) {
        Car mas[] = new Car[n];
        mas[0] = new Car(123456, "ford", "K-45", 1998, "красный", 20000, 15456);
        mas[1] = new Car(123484, "BMW", "S", 2016, "серый", 45788, 14161);
        mas[2] = new Car(123484, "audi", "458", 2011, "белый", 123131, 456655);
        mas[3] = new Car(123484, "honda", "5009", 2021, "розовый", 4567, 95163);
        return mas;
    }

    public static void showMas(Car[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }

    public void create() {
        System.out.println("Задание 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите марку машины");
        while (!sc.hasNextLine()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        zad = sc.nextLine();
    }

    public static void zad1(Car[] mas) {
        int ch = 0;
        do {
            mas[0].create();
            for (int i = 0; i < mas.length; i++) {
                if (mas[i].marka.equals(mas[0].zad)) {
                    mas[i].show();
                    ch++;
                }
            }
            for (int i = 0; i < mas.length; i++) {
                if (mas[i].marka.equals(mas[0].zad.toUpperCase())) {
                    mas[i].show();
                    ch++;
                }
            }
            if (ch == 0) System.out.println("Машин такой марки нет)");
        } while (ch == 0);
    }

    public void create2() {
        System.out.println("Задание 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите модель машины");
        while (!sc.hasNextLine()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        zad = sc.nextLine();
        System.out.println("Введите колличество лет эксплотации машины");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        zad2 = sc.nextInt();
    }

    public static void zad2(Car[] mas) {
        int ch = 0;
        do {
            mas[0].create2();
            for (int i = 0; i < mas.length; i++) {
                mas[i].srok = 2021 - mas[i].year;
            }

            for (int i = 0; i < mas.length; i++) {
                if (mas[i].modele.equals(mas[0].zad) && mas[i].srok > mas[0].zad2) {
                    mas[i].show();
                    ch++;
                }
            }
            if (ch == 0) System.out.println("Таких машин нет)");
        } while (ch == 0);
    }

    public void create3() {
        System.out.println("Задание 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год выпуска машины");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        zad3 = sc.nextInt();
        System.out.println("Введите стоимость машины");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        zad2 = sc.nextInt();
    }

    public static void zad3(Car[] mas) {
        int ch = 0;
        do {
            mas[0].create3();
            for (int i = 0; i < mas.length; i++) {
                if (mas[i].year == mas[0].zad3 && mas[i].price > mas[0].zad2) {
                    mas[i].show();
                    ch++;
                }
            }
            if (ch == 0) System.out.println("Таких машин нет)");
        } while (ch == 0);
    }
}
