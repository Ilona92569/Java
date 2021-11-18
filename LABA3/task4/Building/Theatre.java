package task4.Building;

public class Theatre extends PublicBuilding{
    private String performances;

    public Theatre(int numberPerson, String name, boolean build, String performances) {
        super(numberPerson, name, build);
        this.performances = performances;
    }

    public String getPerformances() {
        return performances;
    }

    public void setPerformances(String performances) {
        this.performances = performances;
    }
    @Override
    public boolean build() {
        return getBuild();
    }
}
