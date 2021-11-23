package Task1;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student ilona = new Student("Ilona", 3);
        Student anna = new Student("Anna", 3);
        Student dana = new Student("Dana", 2);
        Student angelina = new Student("Angelina", 1);
        Student kirill = new Student("Kirill", 3);
        Student karina = new Student("Karina", 2);
        Student vova = new Student("Vova", 4);
        Student vlad = new Student("Vlad", 1);
        //Task1.1
        System.out.println("Task 1");
        LinkedList<Student> students = new LinkedList<>();
        students.add(ilona);
        students.add(angelina);
        students.add(anna);
        students.add(dana);
        students.add(kirill);
        int course=Utils.interCourse();
        Student.printStudents(students, course);
        //Task1.2
        System.out.println("Task 2");
        LinkedList<Student> students1 = new LinkedList<>();
        students1.add(ilona);
        students1.add(anna);
        students1.add(karina);
        students1.add(vlad);
        students1.add(vova);
        Set<Student> studentUnion=Student.union(students, students1);
        Student.printSet(studentUnion);
        //Task1.3
        System.out.println("Task 3");
        Set<Student> studentIntersect=Student.intersect(students, students1);
        Student.printSet(studentIntersect);
        //Task1.4
        System.out.println("Task 4");
        Set<Student> treeSet = new TreeSet<>();
        treeSet.add(ilona);
        treeSet.add(karina);
        treeSet.add(angelina);
        treeSet.add(vova);
        Student.printSet(treeSet);
    }
}
