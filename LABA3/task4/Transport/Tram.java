package task4.Transport;

public class Tram extends PublicTransport{
    private int time;
    private String march;

    public Tram(int numberPerson, boolean wheels, boolean rails, int time, String march) {
        super(numberPerson, wheels, rails);
        this.time = time;
        this.march = march;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getMarch() {
        return march;
    }

    public void setMarch(String march) {
        this.march = march;
    }

    @Override
    public void go() {
        System.out.println("Go");
    }
}
