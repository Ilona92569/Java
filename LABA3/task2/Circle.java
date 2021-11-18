package task2;

public class Circle implements  Scare{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double scare() {
        return Math.PI*Math.pow(radius,2);
    }
}
