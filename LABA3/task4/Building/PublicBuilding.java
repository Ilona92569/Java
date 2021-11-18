package task4.Building;

public abstract class PublicBuilding implements Building{
    private int numberPerson;
    private String name;
    private boolean build;

    public PublicBuilding(int numberPerson, String name, boolean build) {
        this.numberPerson = numberPerson;
        this.name = name;
        this.build = build;
    }

    public boolean getBuild() {
        return build;
    }

    public void setBuild(boolean build) {
        this.build = build;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
