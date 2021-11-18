package task4.Student;

public abstract class Student implements Enrollee{
    private String name, surname, faculty, group;

    public Student(String name, String surname, String faculty, String group) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void goToUniversity() {

    }


}
