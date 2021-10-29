package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int id, course, group, db, zad3;
    private String fio, number, address, fac, zad;

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getDb() {
        return db;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getFac() {
        return fac;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    //public void setZa(String a){zad=a;}

    public static void vvod(Student[] mas, int pr) {
        switch (pr) {
            case 1:
                Student.zad1(mas);
                break;
            case 2:
                Student.zad2(mas);
                break;
            case 3:
                Student.zad3(mas);
                break;
            case 4:
                Student.zad4(mas);
                break;
            default:
                System.out.println("Номера такого задания нет");
        }
    }

    public Student(int id, String fio, int db, String address, String number, String fac, int course, int group) {
        this.id = id;
        this.fio = fio;
        this.db = db;
        this.address = address;
        this.number = number;
        this.fac = fac;
        this.course = course;
        this.group = group;
    }

    public void show() {
        System.out.println("Id: " + getId() + " ФИО: " + getFio() + " Дата рождения: " + getDb() + " Адрес: " + getAddress() + " Телефон: " + getNumber() + " Факультет: " + getFac() + " Курс: " + getCourse() + " Группа: " + getGroup());
    }

    public static Student[] createMass(int n) {
        Student mas[] = new Student[n];
        mas[0] = new Student(123456, "Сосна Илона Александровна", 2002, "ул. Л.Беды, дом 4 корпус 1", "80336559392", "ФИК", 3, 963101);
        mas[1] = new Student(123484, "Песецкая Анна Алексеевна", 2003, "ул. Л.Беды, дом 4 корпус 1", "80294671525", "ФКП", 3, 963102);
        mas[2] = new Student(123484, "Песецкая Анна Алексеевна", 2001, "ул. Л.Беды, дом 4 корпус 1", "80294671525", "ФКП", 3, 963101);
        mas[3] = new Student(123484, "Песецкая Анна Алексеевна", 2000, "ул. Л.Беды, дом 4 корпус 1", "80294671525", "ФКП", 3, 963102);
        return mas;
    }

    public static void showMas(Student[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }

    public void create() {
        System.out.println("Задание 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите определённый факультет");
        while (!sc.hasNextLine()) {
            System.out.println("Введите ещё раз факультет");
            sc.next();
        }
        zad = sc.nextLine();
    }

    public void create3() {
        System.out.println("Задание 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите определённый год");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз год");
            sc.next();
        }
        zad3 = sc.nextInt();
    }

    public void create4() {
        System.out.println("Задание 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите определённую группу");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз группу");
            sc.next();
        }
        zad3 = sc.nextInt();
    }

    public static void zad1(Student[] mas) {
        int ch = 0;
        do {
            mas[0].create();

            for (int i = 0; i < mas.length; i++) {
                if (mas[i].fac.equals(mas[0].zad)) {
                    mas[i].show();
                    ch++;
                }
            }
            for (int i = 0; i < mas.length; i++) {
                if (mas[i].fac.equals(mas[0].zad.toUpperCase())) {
                    mas[i].show();
                    ch++;
                }
            }
            if (ch == 0) System.out.println("Студентов с таким факультетом нет)");
        } while (ch == 0);
    }

    public static void zad2(Student[] mas) {
        System.out.println("Задание 2");
        System.out.println("Студенты ФИК:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].fac.equals("ФИК")) {
                mas[i].show();

            }
        }
        System.out.println("Студенты ФКП:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].fac.equals("ФКП")) {
                mas[i].show();

            }
        }
        System.out.println("Студенты ФРЭ:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].fac.equals("ФРЭ")) {
                mas[i].show();

            }
        }
        System.out.println("Студенты ФКСИС:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].fac.equals("ФКСИС")) {
                mas[i].show();

            }
        }
        System.out.println("Студенты ИЭФ:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].fac.equals("ИЭФ")) {
                mas[i].show();

            }
        }
        System.out.println("Студенты ФИТУ:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].fac.equals("ФИТУ")) {
                mas[i].show();

            }
        }
        System.out.println("Студенты 1 курса:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].course == 1) {
                mas[i].show();

            }
        }
        System.out.println("Студенты 2 курса:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].course == 2) {
                mas[i].show();

            }
        }
        System.out.println("Студенты 3 курса:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].course == 3) {
                mas[i].show();

            }
        }
        System.out.println("Студенты 4 курса:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].course == 4) {
                mas[i].show();

            }
        }
    }

    public static void zad3(Student[] mas) {
        int ch = 0;
        do {
            mas[0].create3();

            for (int i = 0; i < mas.length; i++) {
                if (mas[i].db > mas[0].zad3) {
                    mas[i].show();
                    ch++;
                }
            }
            if (ch == 0) System.out.println("Студентов с таким годом нет)");
        } while (ch == 0);
    }

    public static void zad4(Student[] mas) {
        int ch = 0;
        do {
            mas[0].create4();

            for (int i = 0; i < mas.length; i++) {
                if (mas[i].group == mas[0].zad3) {
                    mas[i].show();
                    ch++;
                }
            }
            if (ch == 0) System.out.println("Студентов с такой группой нет)");
        } while (ch == 0);
    }
}
