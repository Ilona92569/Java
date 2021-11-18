package task1;

public class Vector implements Arithmetic{
    private int[] vector;

    public Vector() {
    }

    public Vector(final int x1, final int x2, final int x3) {
        vector = new int [3];
        vector[0]=x1;
        vector[1]=x2;
        vector[2]=x3;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public double len() {
        double len = Math.sqrt(Math.pow(vector[0], 2) + Math.pow(vector[1], 2) + Math.pow(vector[3], 2));
        return len;
    }

    @Override
    public void addition() {
        Vector vector2 = new Vector(23,15,25);
            double sum = (vector[0] * vector2.vector[0]) + (vector[1] * vector2.vector[1]) + (vector[2] * vector2.vector[2]);
            System.out.println("Сумма векторов: " + sum);
    }

    @Override
    public void comparison() {
        Vector vector2 = new Vector(23,15,25);
        System.out.println("Length 1: "+ this.len());
        System.out.println("Length 2: "+ vector2.len());
        if(this.len()>vector2.len()){
            System.out.println("length 1 is greater than length 2");
        }
        if(this.len()<vector2.len()){
            System.out.println("length 2 is greater than length 1");
        }
        if(this.len()==vector2.len()){
            System.out.println("Are equal");
        }
    }

}
