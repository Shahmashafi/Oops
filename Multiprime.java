import java.util.Scanner;
class Multiplication extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " * 5 = " + (i * 5));
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.print("Interrupted");
        }
    }
}

class Prime extends Thread {
    public void run() {
        int j, limit,f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit:\n ");
        limit = sc.nextInt();

        try {
            int n = 2, i = 1;
            while (i <= limit) {
                f = 1; 
                for (j = 2; j < n; j++) {
                    if (n % j == 0) {
                        f = 0; 
                        break;
                    }
                }
                if (f == 1) {
                    i++;
                    System.out.println("Prime Number: " + n);
                }
                n++;
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.print("Interrupted");
        }
    }
}

class Multiprime {
    public static void main(String args[]) {
        Multiplication m = new Multiplication();
        Prime p = new Prime();
        m.start();
        p.start();
    }
}

