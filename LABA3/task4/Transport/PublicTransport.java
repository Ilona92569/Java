package task4.Transport;

public abstract class PublicTransport implements Transport{
    private int numberPerson;
    private boolean wheels;
    private boolean rails;

    public PublicTransport(int numberPerson, boolean wheels, boolean rails) {
        this.numberPerson = numberPerson;
        this.wheels = wheels;
        this.rails = rails;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public boolean isWheels() {
        return wheels;
    }

    public void setWheels(boolean wheels) {
        this.wheels = wheels;
    }

    public boolean isRails() {
        return rails;
    }

    public void setRails(boolean rails) {
        this.rails = rails;
    }
}
