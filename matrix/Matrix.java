package matrix;

public class Matrix {
    
    private final int SIZE = 4;
    private int[][] numbers = new int[SIZE][SIZE];
    
    public Matrix() {}
    
    public void addMatrix(Matrix A, Matrix B){
        for(int a = 0; a < this.numbers.length; a++){
            for(int b = 0; b < this.numbers.length; b++){
                this.numbers[a][b] = A.getCell(a, b) 
                        + B.getCell(a, b);
            }
        }
    }
    
    public int getCell(int x, int y){
        return this.numbers[x][y];
    }
    
    public void setCell(int x, int y, int value){
        this.numbers[x][y] = value;
    }
    
    public void displayMatrix(){
        for(int a = 0; a < this.numbers.length; a++){
            for(int b = 0; b < this.numbers.length; b++){
                showCell(a, b);
            }
            System.out.println();
        }
    }
    
    public void showCell(int x, int y){
        System.out.print(this.numbers[x][y] + " ");
    }
}
