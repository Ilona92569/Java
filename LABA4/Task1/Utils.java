package Task1;

import java.util.Scanner;

public class Utils {
    public static int interCourse(){
        Scanner sc = new Scanner(System.in);
        int course;
        do{
            System.out.println("Enter course:");
            while (!sc.hasNextInt()){
                System.out.println("Again");
                sc.next();
            }
            course=sc.nextInt();
        }while (course<1||course>5);
        return course;
    }
}
