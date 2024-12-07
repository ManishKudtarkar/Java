import java.util.*;

class PrimeNumbers {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = scan.nextInt();
        System.out.print("Prime numbers between 1 to " + num + " are:");
        for (int i = 2; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 2) System.out.print(i + " ");
        }
        scan.close();
    }
}
