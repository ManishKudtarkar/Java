import java.util.Scanner;

public class palin {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any String:");
        String str = scan.nextLine();
        String revString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revString = revString + str.charAt(i);
        }
        if (str.equalsIgnoreCase(revString))
            System.out.println(str + " is a palindrome string");
        else
            System.out.println(str + " is not a palindrome string");
        scan.close();
    }
}
