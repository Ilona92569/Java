package task3;

import javax.swing.border.MatteBorder;

public class ComplexNumbers implements Norma{
    private double x, y;

    public ComplexNumbers(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double norma() {
        return Math.sqrt((Math.pow(x,2)+Math.pow(y,2)));
    }
}
