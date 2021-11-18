package task4.Engineer;

public class Supervisor extends Engineer{
    private double experience;

    public Supervisor(String name, String surname, String position, int number, boolean work, double experience) {
        super(name, surname, position, number, work);
        this.experience = experience;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}
