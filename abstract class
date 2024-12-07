abstract class Bank {
    abstract double rate();
}

class SBI extends Bank {
    double rate() {
        return 5.5;
    }
}

class HDFC extends Bank {
    double rate() {
        return 15.15;
    }
}

public class AbstractClass {
    public static void main(String args[]) {
        Bank bank = new SBI();
        System.out.println("SBI rate = " + bank.rate());

        bank = new HDFC();
        System.out.println("HDFC rate = " + bank.rate());
    }
}
