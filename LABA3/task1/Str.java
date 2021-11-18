package task1;

import java.util.Scanner;

public class Str implements Arithmetic{
    private char[] chars;

    public char[] getChars() {
        return chars;
    }

    public void setChars(char[] chars) {
        this.chars = chars;
    }

    public Str(final String str){
        chars = str.toCharArray();
    }

    public char task1(int number){
        return chars[number];
    }

    public char[] chars(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        chars = str.toCharArray();
        return chars;
    }

    public void show(){
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }
        System.out.println();
    }

    @Override
    public void addition() {
        char[] chars2=chars();
        char[] charsNew= new char[chars2.length+chars.length];
        for (int i = 0, j=chars.length-1; i < chars.length && j< (chars.length+chars2.length); i++, j++) {
            charsNew[i]=chars[i];
            charsNew[j]=chars2[j];
        }
        for (int i = 0; i < charsNew.length; i++) {
            System.out.print(charsNew[i]+" ");
        }
        System.out.println();
    }

    @Override
    public void comparison() {
        char[] chars2=chars();
        System.out.println("Line 1:");
        show();
        System.out.println("Line 2:");
        for (int i = 0; i < chars2.length; i++) {
            System.out.print(chars2[i]+" ");
        }
        System.out.println();
        if(chars2.length>chars.length){
            System.out.println("Line 2 is greater than line 1");
        }
        if(chars2.length<chars.length){
            System.out.println("Line 1 is greater than line 2");
        }
        if(chars2.length==chars.length){
            System.out.println("Are equal");
        }
    }
}
