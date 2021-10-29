package zad_2;

import java.util.Scanner;

public class Book {
    public String author, title;
    public int yeas, kol;
    public Book(){}
    public Book (String author, String title, int yeas, int kol){
        this.author=author;
        this.title=title;
        this.yeas=yeas;
        this.kol=kol;
    }
    public static Book[] createMass(int n) {
        Book mas[] = new Book[n];
        mas[0] = new Book("Сосна И.А.","День сурка", 2011, 123);
        mas[1] = new Book("Песецкая А.А.","Джава на русском", 2001, 1123);
        mas[2] = new Book("Русецкая У.С.","Только сейчас", 2013, 423);
        mas[3] = new Book("Сосна К.А.","Другое", 2015, 1443);
        return mas;
    }
    public void show() {
        System.out.println("Автор: "+author+  " Название книги: "+title+" Год выпуска: "+yeas+" Колличество страниц: " +kol );
    }
    public static void showMas(Book[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }
    public static void vvod(Book[] mas, int pr) {
        switch (pr) {
            case 1:
                Book.author(2,"Сосна И.И.",mas);
                Book.title(2,"Года идут",mas);
                Book.yeas(3,2154,mas);
                Book.kol(0,3,mas);
                Book.zad("Другое",mas);
                break;
            case 2:
                Book.author(mas);
                Book.title(mas);
                Book.yeas(mas);
                Book.kol(mas);
                Book.zad(mas);
                break;
            default:
                System.out.println("Номера такого задания нет");
        }
    }
    public static int Int(){
        int i;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Введите номер книги");
            while (!sc.hasNextInt()){
                System.out.println("Введите ещё раз");
                sc.next();
            }
            i=sc.nextInt();
        } while (i>3 || i<0);
        return i;
    }
    public static int Int2(){
        int i;
        Scanner sc = new Scanner(System.in);
            System.out.println("Введите параметр");
            while (!sc.hasNextInt()){
                System.out.println("Введите ещё раз");
                sc.next();
            }
            i=sc.nextInt();
        return i;
    }
    public static String String(){
        String b;
        Scanner sc = new Scanner(System.in);
            System.out.println("Введите параметр");
            while (!sc.hasNextLine()) {
                System.out.println("Введите ещё раз");
                sc.next();
            }
            b = sc.nextLine();
            return b;
    }
    public static void author(int a, String b, Book[] mas){
        System.out.println("Измениние автора:");
        mas[a].author=b;
        showMas(mas);
    }
    public static void title(int a, String b, Book[] mas){
        System.out.println("Измениние названия:");
        mas[a].title=b;
        showMas(mas);
    }
    public static void yeas(int a, int b, Book[] mas){
        System.out.println("Измениние года выпуска:");
        mas[a].yeas=b;
        showMas(mas);
    }
    public static void kol(int a, int b, Book[] mas){
        System.out.println("Измениние колличества страниц:");
        mas[a].kol=b;
        showMas(mas);
    }
    public static void zad(String b, Book[]mas){
        System.out.println("Поиск книги по названию:");
        for(int i=0; i< mas.length; i++) {
            if (mas[i].title.equals(b)) mas[i].show();
        }
    }
    public static void author(Book[] mas){
        int i=Book.Int();
        String b=Book.String();
        mas[i].author=b;
        showMas(mas);
    }
    public static void title(Book[] mas){
        int i=Book.Int();
        String b=Book.String();
        mas[i].title=b;
        showMas(mas);
    }
    public static void yeas(Book[] mas){
        int i=Book.Int();
        int b=Book.Int2();
        mas[i].yeas=b;
        showMas(mas);
    }
    public static void kol(Book[] mas){
        int i=Book.Int();
        int b=Book.Int2();
        mas[i].kol=b;
        showMas(mas);
    }
    public static void zad(Book[]mas){

        String b=Book.String();
        for(int i=0; i< mas.length; i++) {
            if (mas[i].title.equals(b)) mas[i].show();
        }
    }
}
