import java.util.Scanner;


public class zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 2");

        double a = 0, b = 0, raz=0;
        double h = 0;
        do {
            System.out.println("Введите два числа равные пределам отрезка ");
            while (!sc.hasNextDouble()) {
                System.out.println("Введите ещё раз число: ");
                sc.next();
            }
            a = sc.nextDouble();
            System.out.println("Введите второе число ");
            while (!sc.hasNextDouble()) {
                System.out.println("Введите ещё раз число: ");
                sc.next();
            }
            b = sc.nextDouble();
            System.out.println("Введите число равное шагу ");
            while (!sc.hasNextDouble()) {
                System.out.println("Введите ещё раз число: ");
                sc.next();
            }
            h = sc.nextDouble();
            double x = 0;
            if (a > b)  raz=a-b;
            if (a < b)  raz=b-a;
            if (h <= raz) {
                if (a > b) {
                    for (double i = b; i <= a; i += h) {
                        x = i / (double) Math.cos(i);
                        System.out.println(i + "     " + x);
                    }
                }
                if (a < b) {
                    for (double i = a; i <= b; i += h) {
                        x = i / (double) Math.cos(i);
                        System.out.println(i + "     " + x);
                    }
                }
            }
        }
        while (h > raz);
    }
}
