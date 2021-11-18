package task4.Engineer;

public class Engineer implements  Employee{
    private String name, surname, position;
    private int number;
    private boolean work;

    public Engineer(String name, String surname, String position, int number, boolean work) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.number = number;
        this.work = work;
    }

    public boolean getWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean work() {
        return work;
    }
}
