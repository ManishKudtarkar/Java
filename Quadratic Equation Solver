import java.util.*;

public class QuadEquation {
    public static void main(String args[]) {
        double a, b, c, deter, root1, root2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a:");
        a = scan.nextDouble();
        System.out.print("Enter b:");
        b = scan.nextDouble();
        System.out.print("Enter c:");
        c = scan.nextDouble();

        deter = (b * b) - (4 * a * c);
        System.out.printf("\nDeterminant = " + deter);

        if (deter > 0) {
            System.out.println("\nTwo real and distinct roots are present.");
            root1 = (-b + Math.sqrt(deter)) / (2 * a);
            root2 = (-b - Math.sqrt(deter)) / (2 * a);
            System.out.printf("Root1 = %.3f", root1);
            System.out.printf("\nRoot2 = %.3f", root2);
        } else if (deter == 0) {
            root1 = -b / (2 * a);
            System.out.printf("\nRoot1 = Root2 = %.3f", root1);
        } else {
            System.out.println("\nReal roots are not available.");
        }
        scan.close();
    }
}
