package task4.Ship;

public class Aircraft extends Warship{
    private String name;
    private int numberMissiles;
    private boolean sail;

    public Aircraft(String missilesName, String name, int numberMissiles, boolean sail) {
        super(missilesName);
        this.name = name;
        this.numberMissiles = numberMissiles;
        this.sail = sail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberMissiles() {
        return numberMissiles;
    }

    public void setNumberMissiles(int numberMissiles) {
        this.numberMissiles = numberMissiles;
    }

    public boolean isSail() {
        return sail;
    }

    public void setSail(boolean sail) {
        this.sail = sail;
    }

    @Override
    public void sail() {
        System.out.println("Sail");
        sail=true;
    }
}
