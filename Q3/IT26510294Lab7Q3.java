import java.util.Scanner;

public class IT26510294Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Bill: ");
            double bill = input.nextDouble();

            System.out.print("Payment (C/O): ");
            char p = input.next().charAt(0);

            if (p == 'C' || p == 'c') {
                System.out.println("Discount: " + bill * 0.05);
                System.out.println("Pay: " + bill * 0.95);
            } else if (p == 'O' || p == 'o') {
                System.out.println("Discount: 0");
                System.out.println("Pay: " + bill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
        }
    }
}