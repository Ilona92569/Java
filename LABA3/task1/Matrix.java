package task1;

import java.util.Random;
import java.util.Scanner;

public class Matrix implements Arithmetic {
    public int[][] matrix;

    public Matrix(int dimensionM, int dimensionN) {
        matrix = new int[dimensionM][dimensionN];
    }

    public Matrix() {
        matrix = new int[10][10];
    }

    public void show(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("\t"+matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("matrix[" + i + "][" + j + "]=");
                while (!sc.hasNextInt()) {
                    System.out.println("Again");
                    sc.next();
                }
                matrix[i][j] = sc.nextInt();
                System.out.println();
            }
        }
    }

    public void random(int mx[][]) {
        Random random = new Random();
        for (int i = 0; i < mx.length; i++) {
            for (int j = 0; j < mx[i].length; j++) {
                mx[i][j] = random.nextInt() * 100;
            }
        }
    }

    public int value(int M, int N) {
        return matrix[M][N];
    }

    public void scaling(int divider) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (matrix[i][j] / divider);
            }
        }
    }

    @Override
    public void addition() {
        int[][] matrix2 = new int[matrix.length][matrix[0].length];
        random(matrix2);
        int [][] matrix3 = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix3[i][j]=matrix[i][j]+matrix2[i][j];
            }
        }
    }

    @Override
    public void comparison() {
        int[][] matrix2 = new int[matrix.length][matrix[0].length];
        random(matrix2);
        int kol=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix2[i][j]>matrix[i][j]){
                    kol++;
                }
                else kol--;
            }
        }
        if(kol>0){
            System.out.println("Matrix 2 > matrix 1 ");
        }
        else {
            System.out.println("Matrix 1 > matrix 2");
        }
    }
}
