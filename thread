public class MultiThreadEx {
    public static void main(String args[]) {
        Wait obj = new Wait();
        obj.start(); // Parallel execution of main and run

        for (int i = 1; i <= 100; i++) {
            System.out.println("bye");
        }
    }
}

class Wait extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
