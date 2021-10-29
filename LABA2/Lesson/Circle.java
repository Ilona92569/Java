package zad_2;

import java.util.Scanner;

public class Circle {
    public double radius, x, y;
    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle( double x, double y){
        this.x=x;
        this.y=y;
    }
    public Circle(double radius, double x, double y){
        this.radius=radius;
        this.x=x;
        this.y=y;
    }
    public void show (){
        System.out.println("Радиус "+radius+" Х "+x+" У "+y);
    }
    public void zad1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры по которым хотите изменить координаты центра окружности");
        System.out.println("Измененние x");
        while (!sc.hasNextDouble()){
            System.out.println("Введите ещё раз");
            sc.next();
        }
        double a=sc.nextDouble();
        System.out.println("Измененние y");
        while (!sc.hasNextDouble()){
            System.out.println("Введите ещё раз");
            sc.next();
        }
        double b=sc.nextDouble();
        x+=a;
        y+=b;
    }
    public void zad2() {
        Scanner sc = new Scanner(System.in);
        double c;
        do{
        System.out.println("Введите параметры по которым хотите изменить радиус");
        while (!sc.hasNextDouble()) {
            System.out.println("Введите ещё раз");
            sc.next();
        }
        c = sc.nextDouble();
        if (c > 0)
            radius += c;
    }while (c<0);
    }
    public void zad3(){
        double S=Math.PI*Math.pow(radius,2);
        System.out.println("Площадь: "+S);
    }
    public void zad4(){
        double C=2*Math.PI*radius;
        System.out.println("Длина окружности:"+C);
    }
}
