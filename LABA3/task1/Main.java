package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix matrix = new Matrix(5, 5);
        int task;
        do {
            System.out.println("Choose the task");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            task = sc.nextInt();
            switch (task) {
                case 1:
                    matrix.input();
                    break;
                case 2:
                    matrix.random(matrix.matrix);
                    break;
                case 3:
                    int M, N;
                    do {
                        System.out.println("Enter the M");
                        while (!sc.hasNextInt()) {
                            System.out.println("Again");
                            sc.next();
                        }
                        M = sc.nextInt();
                        System.out.println("Enter the N");
                        while (!sc.hasNextInt()) {
                            System.out.println("Again");
                            sc.next();
                        }
                        N = sc.nextInt();
                    } while (M>4 && N>4);
                    matrix.value(M, N);
                    break;
                case 4:
                    int divider;
                    System.out.println("Enter the divisor");
                    while (!sc.hasNextInt()) {
                        System.out.println("Again");
                        sc.next();
                    }
                    divider = sc.nextInt();
                    matrix.scaling(divider);
                    break;
                case 5:
                    matrix.addition();
                    break;
                case 6:
                    matrix.comparison();
                    break;
                case 7:
                    matrix.show();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("There is no such task");

            }
        } while (task!=8);
    }
}
