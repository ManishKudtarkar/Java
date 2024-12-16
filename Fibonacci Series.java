import java.util.Scanner;

public class fibo {
    public static void main(String args[]) {
        int a, b, sum;
        a = b = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = scan.nextInt();
        System.out.printf("%d, %d,", 1, 1);
        for (int i = 3; i <= num; i++) {
            sum = a + b;
            System.out.print(sum + ", ");
            a = b;
            b = sum;
        }
        System.out.printf("\n%dth term is %d", num, sum);
        scan.close();
    }
}
