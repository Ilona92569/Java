package task4.Ship;

public class CargoShip implements Ship{
    private boolean sail;
    private String name;

    public CargoShip(boolean sail, String name) {
        this.sail = sail;
        this.name = name;
    }

    public boolean isSail() {
        return sail;
    }

    public void setSail(boolean sail) {
        this.sail = sail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sail() {
        sail=true;
    }
}
