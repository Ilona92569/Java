package com.company;

import java.util.Scanner;

public class Patient {
    private int id, numberk, zad2, zad3;
    private String fio, number, address, diagnoz, zad;

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getNumberk() {
        return numberk;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    //public void setZa(String a){zad=a;}
    public static void vvod(Patient[] mas, int pr) {
        switch (pr) {
            case 1:
                Patient.zad1(mas);
                break;
            case 2:
                Patient.zad2(mas);
                break;
            default:
                System.out.println("Номера такого задания нет");
        }
    }

    public Patient(int id, String fio, String address, String number, int numberk, String diagnoz) {
        this.id = id;
        this.fio = fio;
        this.address = address;
        this.number = number;
        this.numberk = numberk;
        this.diagnoz = diagnoz;
    }

    public void show() {
        System.out.println("Id: " + getId() + " ФИО: " + getFio() + " Адрес: " + getAddress() + " Телефон: " + getNumber() + " Номер карточки: " + getNumberk() + " Диагноз: " + getDiagnoz());
    }

    public static Patient[] createMass(int n) {
        Patient mas[] = new Patient[n];
        mas[0] = new Patient(123456, "Сосна Илона Александровна", "ул. Л.Беды, дом 4 корпус 1", "80336559392", 1111, "ОРВИ");
        mas[1] = new Patient(123484, "Песецкая Анна Алексеевна", "ул. Л.Беды, дом 4 корпус 1", "80294671525", 2222, "СOVID");
        mas[2] = new Patient(123484, "Песецкая Анна Алексеевна", "ул. Л.Беды, дом 4 корпус 1", "80294671525", 3333, "ОРВИ");
        mas[3] = new Patient(123484, "Песецкая Анна Алексеевна", "ул. Л.Беды, дом 4 корпус 1", "80294671525", 4444, "СOVID");
        return mas;
    }

    public static void showMas(Patient[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }

    public void create() {
        System.out.println("Задание 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите диагноз");
        while (!sc.hasNextLine()) {
            System.out.println("Введите ещё раз диагноз");
            sc.next();
        }
        zad = sc.nextLine();
    }

    public void create2() {
        System.out.println("Задание 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите интервал номеров карточек, в котором нужно вывести список пациетов");
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

    public static void zad1(Patient[] mas) {
        int ch = 0;
        do {
            mas[0].create();
            for (int i = 0; i < mas.length; i++) {
                if (mas[i].diagnoz.equals(mas[0].zad)) {
                    mas[i].show();
                    ch++;
                }
            }
            for (int i = 0; i < mas.length; i++) {
                if (mas[i].diagnoz.equals(mas[0].zad.toUpperCase())) {
                    mas[i].show();
                    ch++;
                }
            }
            if (ch == 0) System.out.println("Такого диагноза нет)");
        } while (ch == 0);
    }

    public static void zad2(Patient[] mas) {
        int ch = 0;
        do {
            mas[0].create2();
            if (mas[0].zad2 > 0 && mas[0].zad3 > 0) {
                if (mas[0].zad2 > mas[0].zad3) {
                    for (int i = 0; i < mas.length; i++) {
                        if (mas[i].numberk > mas[0].zad3 && mas[i].numberk < mas[0].zad2) {
                            mas[i].show();
                            ch++;
                        }
                    }
                }
                if (mas[0].zad2 < mas[0].zad3) {
                    for (int i = 0; i < mas.length; i++) {
                        if (mas[i].numberk < mas[0].zad3 && mas[i].numberk > mas[0].zad2) {
                            mas[i].show();
                            ch++;
                        }
                    }
                }
                if (ch == 0) System.out.println("Пациентов в таком интервале нет)");
            }
        } while (mas[0].zad2 < 1 || mas[0].zad3 < 1);
    }
}
