package zad_2;

import com.company.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберете задание");
        int pr;
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        pr = sc.nextInt();
        switch (pr) {
            case 1:
            Circle ob = new Circle(12.45, 45, -12.3);
            ob.show();
            ob.zad3();
            ob.zad4();
            ob.zad1();
            ob.zad2();
            ob.show();
            ob.zad3();
            ob.zad4();
            break;
            case 2:
                Warehouse mas[]=Warehouse.createMass(4);
                System.out.println("Выберете задание");
                while (!sc.hasNextInt()) {
                    System.out.println("Введите ещё раз");
                    sc.next();
                }
                pr = sc.nextInt();
                Warehouse.vvod(mas, pr);
                break;
            case 3:
                Book mas1[]=Book.createMass(4);
                System.out.println("Выберете задание");
                while (!sc.hasNextInt()) {
                    System.out.println("Введите ещё раз");
                    sc.next();
                }
                pr = sc.nextInt();
                Book.vvod(mas1, pr);
                break;
            case 4:
                Fraction mas2[]=Fraction.createMass(4);
                System.out.println("Выберете задание");
                while (!sc.hasNextInt()) {
                    System.out.println("Введите ещё раз");
                    sc.next();
                }
                pr = sc.nextInt();
                Fraction.vvod(mas2, pr);
                break;
            case 5:
                Vector mas3[]=Vector.createMass(4);
                System.out.println("Выберете задание");
                while (!sc.hasNextInt()) {
                    System.out.println("Введите ещё раз");
                    sc.next();
                }
                pr = sc.nextInt();
                Vector.vvod(mas3, pr);
                break;
            case 6:
                Array mas4[]=Array.createMass(3);
                System.out.println("Выберете задание");
                while (!sc.hasNextInt()) {
                    System.out.println("Введите ещё раз");
                    sc.next();
                }
                pr = sc.nextInt();
                Array.vvod(mas4, pr);
                break;
            case 7:
                Equation mas5[] = Equation.createMas(2);
                System.out.println("Выберете задание");
                while (!sc.hasNextInt()) {
                    System.out.println("Введите ещё раз");
                    sc.next();
                }
                pr = sc.nextInt();
                Equation.vvod(mas5, pr);
                break;

            default:
                System.out.println("Номера такого задания нет");
        }
        sc.close();
    }
}
