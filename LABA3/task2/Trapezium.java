package task2;

public class Trapezium implements Scare{
    private int a, b, c, d;
    private double high;

    public Trapezium(int a, int b, int c, int d, double high) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.high = high;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double scare() {
        return ((double)(a+c)/2)*high;
    }
}
