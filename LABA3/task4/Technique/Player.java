package task4.Technique;

public abstract class Player implements Technique{
    private int firstPrice;

    public Player(int firstPrice) {
        this.firstPrice = firstPrice;
    }

    public int getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(int firstPrice) {
        this.firstPrice = firstPrice;
    }
}
