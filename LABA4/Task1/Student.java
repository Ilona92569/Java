package Task1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Student implements Comparable<Student>{
    private String fio;
    private int course;

    public Student(String fio, int course) {
        this.fio = fio;
        this.course = course;
    }

//    public static void printStudents(LinkedList<Student> students) {
//        for (Student student:
//             students) {
//            System.out.println(students);
//        }
//    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(LinkedList<Student> students, int course) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).course == course) {
                System.out.println(students.get(i).toString());
            }
        }
    }

    public static Set<Student> union(LinkedList<Student> students, LinkedList<Student> students1) {
        Set<Student> studentsUnion = new HashSet<>();
        studentsUnion.addAll(students);
        studentsUnion.addAll(students1);
        return studentsUnion;
    }

    public static Set<Student> intersect(LinkedList<Student> students, LinkedList<Student> students1){
        Set<Student> studentsIntersect = new HashSet<>();
        studentsIntersect.addAll(students);
        studentsIntersect.retainAll(students1);
        return studentsIntersect;
    }

    public static void printSet(Set<Student> students) {
        for (Student student :
                students) {
            System.out.println(student);
        }
    }

    @Override
    public int compareTo(Student student) {
        return course-student.getCourse();
    }

    public static void printTree(Set<Student> students) {
        for (Student student :
                students) {
            System.out.println(student);
        }
    }
}
