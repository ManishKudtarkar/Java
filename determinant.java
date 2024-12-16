import java.util.Scanner;

class demo {
    public static void main(String args[]) {
        double a, b, c, deter, root1, root2;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a :");
        a = scan.nextDouble();
        System.out.print("enter b :");
        b = scan.nextDouble();
        System.out.print("enter c :");
        c = scan.nextDouble();
        deter = (b * b) - (4 * a * c);
        System.out.println("determinant is :" + deter);
        if (deter < 0) {
            System.out.println("roots are imaginary");
        } else if (deter > 0) {
            root1 = (-b + Math.sqrt(deter)) / (2 * a);
            root2 = (-b - Math.sqrt(deter)) / (2 * a);
            System.out.println("two real roots are:");
            System.out.println("root1=" + root1);
            System.out.println("root2=" + root2);

        } else {
            root1 = root2 = -b / (2 * a);
            System.out.println("roots are equal");
            System.out.println("root1=root2=" + root1);

        }
    }
}

