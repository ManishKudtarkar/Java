import java.util.*;

class AddMatrices {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows = scan.nextInt();
        System.out.print("Enter number of columns:");
        int columns = scan.nextInt();
        int mat1[][] = new int[rows][columns];
        int mat2[][] = new int[rows][columns];
        int addition[][] = new int[rows][columns];

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mat1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mat2[i][j] = scan.nextInt();
            }
        }

        System.out.println("Addition Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                addition[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(addition[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
