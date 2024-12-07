public class FactRecursive {
    public static void main(String args[]) {
        int number = 4;
        FactRecursive obj = new FactRecursive();
        int factResult = obj.fact(number);
        System.out.printf("Factorial of %d is %d", number, factResult);
    }

    int fact(int term) {
        if (term == 0)
            return 1;
        else {
            int returnedValue = fact(term - 1);
            int mul = returnedValue * term;
            return mul;
        }
    }
}
