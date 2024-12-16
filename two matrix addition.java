import java.util.Scanner;

class AddMatrices {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows = scan.nextInt();
        System.out.print("Enter number of columns:");
        int columns = scan.nextInt();

        int[][] mat1 = new int[rows][columns];
        int[][] mat2 = new int[rows][columns];
        int[][] result = new int[rows][columns];

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

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
