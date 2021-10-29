package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        System.out.println("Студенты:");
        Student mas[] = Student.createMass(4);
        System.out.println("Выберете задание");
        int pr;
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        pr = sc.nextInt();
        Student.vvod(mas, pr);
        //Задание 2
        System.out.println("Пациенты:");
        Patient mas2[] = Patient.createMass(4);
        System.out.println("Выберете задание");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        pr = sc.nextInt();
        Patient.vvod(mas2, pr);
        //Задание 3
        System.out.println("Абитуриеты:");
        Abituriet mas3[] = Abituriet.createMass(4);
        System.out.println("Выберете задание");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        pr = sc.nextInt();
        Abituriet.vvod(mas3, pr);
        //Задание 4
        System.out.println("Дом:");
        House mas4[] = House.createMass(4);
        System.out.println("Выберете задание");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        pr = sc.nextInt();
        House.vvod(mas4, pr);
        //Задание 5
        System.out.println("Машины:");
        Car mas5[] = Car.createMass(4);
        System.out.println("Выберете задание");
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        pr = sc.nextInt();
        Car.vvod(mas5, pr);
        sc.close();
    }
}
