import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("10 20 30 40 50");
        int sum = 0;
        while (st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());
            sum += number;
        }
        System.out.println("Sum = " + sum);
    }
}
