package task4.Technique;

public class VideoPlayer extends Player{
    private int price;
    private String brand;

    public VideoPlayer(int firstPrice, int price, String brand) {
        super(firstPrice);
        this.price = price;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void sale() {
        price=price-getFirstPrice();
    }
}
