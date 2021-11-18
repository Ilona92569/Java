package task4.Ship;

public class CargoTanker extends CargoShip{
    private int cargo;

    public CargoTanker(boolean sail, String name, int cargo) {
        super(sail, name);
        this.cargo = cargo;
    }

    @Override
    public void sail() {
        super.sail();
    }
}
