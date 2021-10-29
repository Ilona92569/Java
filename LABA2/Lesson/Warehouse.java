package zad_2;
import java.util.Scanner;

public class Warehouse {
    public int kol;
    public double price, sum;

    public Warehouse() {
    }
    public static void vvod(Warehouse[] mas, int pr) {
        Scanner sc = new Scanner(System.in);
        switch (pr) {
            case 1:
                Warehouse.zad1(mas);
                break;
            case 2:
                Warehouse.zad2(mas);
                break;
            case 3:
                int i;
                do{
            System.out.println("Введите номер товара");
            while (!sc.hasNextInt()){
                System.out.println("Введите ещё раз");
                sc.next();
            }
                    i=sc.nextInt();
        } while (i>3 || i<0);
                System.out.println(Warehouse.zad3(mas, i));
                break;
            case 4:
                int j;
                do {
                    System.out.println("Введите номер первого товара ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Введите ещё раз");
                        sc.next();
                    }
                    i = sc.nextInt();
                } while (i>3 || i<0);
                do {
                    System.out.println("Введите номер второго товара");
                    while (!sc.hasNextInt()) {
                        System.out.println("Введите ещё раз");
                        sc.next();
                    }
                    j = sc.nextInt();
                } while (j>3 || j<0);
                Warehouse.zad4(mas,i,j);
                break;
            case 5:
                System.out.println(Warehouse.zad5(mas,2,3));
                break;
            default:
                System.out.println("Номера такого задания нет");
        }
    }
    public Warehouse(int kol, double price) {
        this.kol = kol;
        this.price = price;
    }
    public void show() {
        System.out.println("Колличество товара: " +kol+" Стоимость за одну еденицу:"+price );
    }
    public static void showMas(Warehouse[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }
    public static Warehouse[] createMass(int n) {
        Warehouse mas[] = new Warehouse[n];
        mas[0] = new Warehouse(25, 45.4);
        mas[1] = new Warehouse(2, 48.4);
        mas[2] = new Warehouse(5, 2.4);
        mas[3] = new Warehouse(11, 46.4);
        return mas;
    }

    public static void zad1(Warehouse[] mas) {
        int i, a;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите номер товара, который хотите изменить");
            while (!sc.hasNextInt()) {
                System.out.println("Введите ещё раз");
                sc.next();
            }
            i = sc.nextInt();
        } while (i>3 || i<0);
        do {
            System.out.println("Введите число на которое хотите изменить колличество товара");
            while (!sc.hasNextInt()) {
                System.out.println("Введите ещё раз");
                sc.next();
            }
            a = sc.nextInt();
        } while(0>mas[i].kol+a);
        mas[i].kol += a;
        System.out.println(i + " товар, новое колличество товара: " + mas[i].kol);
    }

    public static void zad2(Warehouse[] mas) {
        int i;
        double a;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите номер товара, который хотите изменить");
            while (!sc.hasNextInt()) {
                System.out.println("Введите ещё раз");
                sc.next();
            }
            i = sc.nextInt();
        } while (i>3 || i<0);
        do {
            System.out.println("Введите число на которое хотите изменить стоимость товара");
            while (!sc.hasNextDouble()) {
                System.out.println("Введите ещё раз");
                sc.next();
            }
            a = sc.nextDouble();
        } while(0>mas[i].price+a);
        mas[i].price += a;
        System.out.println(i + " товар, новая стоимость товара: " + mas[i].price);
    }

    public static double zad3(Warehouse[] mas, int i) {
        for (int j = 0; j < mas.length; j++) {
            mas[j].sum = mas[j].kol * mas[j].price;
        }

        return mas[i].price = mas[i].sum / mas[i].kol;
    }

    public static void zad4(Warehouse[] mas, int i, int j) {
        if (mas[i].price > mas[j].price) System.out.println(i + " товар больше, чем товар " + j);
        if (mas[i].price < mas[j].price) System.out.println(j + " товар больше, чем товар " + i );
        if (mas[i].price == mas[j].price) System.out.println(j + " товар по стоимости равен товару " + i );

    }

    public static int zad5(Warehouse[] mas, int... a) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            k += mas[a[i]].kol;
        }
        return k;
    }
}
