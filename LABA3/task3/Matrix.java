package task3;

public class Matrix implements Norma{
    private double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public int[] max(){
        double max=matrix[0][0];
        int[] index = new int[2];
        index[0]=0;
        index[1]=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                   index[0]=i;
                    index[1]=j;
                }
            }
        }
        return index;
    }
    @Override
    public double norma() {
        int[] index = max();
        return matrix[index[0]][index[1]];
    }
}
