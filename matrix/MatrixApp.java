package matrix;

public class MatrixApp {
    
    public static void main(String[] args){
        Matrix a = new Matrix();
        Matrix b = new Matrix();
        
        
        System.out.println("Matrix A");
        a.setCell(0, 0, 5);
        a.setCell(0, 1, 10);
        a.setCell(0, 2, 15);
        a.setCell(0, 3, 20);
        a.setCell(1, 0, 25);
        a.setCell(1, 1, 30);
        a.setCell(1, 2, 35);
        a.setCell(1, 3, 40);
        a.setCell(2, 0, 45);
        a.setCell(2, 1, 50);
        a.setCell(2, 2, 55);
        a.setCell(2, 3, 60);
        a.setCell(3, 0, 65);
        a.setCell(3, 1, 70);
        a.setCell(3, 2, 75);
        a.setCell(3, 3, 80);
        a.displayMatrix();
        System.out.println();
        
        System.out.println("Matrix B");
        b.setCell(0, 0, 5);
        b.setCell(0, 1, 10);
        b.setCell(0, 2, 15);
        b.setCell(0, 3, 20);
        b.setCell(1, 0, 25);
        b.setCell(1, 1, 30);
        b.setCell(1, 2, 35);
        b.setCell(1, 3, 40);
        b.setCell(2, 0, 45);
        b.setCell(2, 1, 50);
        b.setCell(2, 2, 55);
        b.setCell(2, 3, 60);
        b.setCell(3, 0, 65);
        b.setCell(3, 1, 70);
        b.setCell(3, 2, 75);
        b.setCell(3, 3, 80);
        b.displayMatrix();
        System.out.println();
        
        
        System.out.println("SUM OF MATRIX A AND B");
        Matrix sum = new Matrix();
        sum.addMatrix(a, b);
        sum.displayMatrix();
        System.out.println();
    }
}
