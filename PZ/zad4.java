import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 4");
        double N = 0;
        do {
            System.out.println("Введите число: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Введите число: ");
                sc.next();
            }
            N = sc.nextDouble();
            double arr2[][] = new double[5][5];
            if (N != 0) {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        arr2[i][j] = ((double) Math.pow(i, 2) - (double) Math.pow(j, 2) / N);
                        System.out.print(arr2[i][j] + "    ");
                    }
                    System.out.println();
                }
            }
        }
        while (N == 0);
    }
}
