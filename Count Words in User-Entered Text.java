import java.util.Scanner;

public class countWords {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter paragraph:");
        String para = "", line = "";
        while (!(line = scan.nextLine()).isEmpty()) {
            para += line + '\n';
        }
        int count = 0;
        for (int i = 0; i < para.length(); i++) {
            if (para.charAt(i) == ' ' || para.charAt(i) == '\n' || para.charAt(i) == '\t') {
                if (i != para.length() - 1 && para.charAt(i + 1) != ' ' && para.charAt(i + 1) != '\n' && para.charAt(i + 1) != '\t')
                    count++;
            }
        }
        count++;
        System.out.println("Number of words = " + count);
        scan.close();
    }
}
