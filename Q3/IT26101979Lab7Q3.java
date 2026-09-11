import java.util.Scanner;
public class IT26101979Lab7Q3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
       
        for (int i = 1; i <= 5; i++) {

            System.out.println("Customer " + i);
            
            System.out.print("Enter total bill amount: ");
            int billAmount = x.nextInt();
            
            
            char mode;
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            mode = Character.toUpperCase(x.next().charAt(0));
                
            if ((mode != 'C' ) && (mode != 'O')) {
                System.out.println("Payment Mode is Not Valid");
                System.out.println();
                continue;
            
            }
            
            double discount, amountToPay;
            
            if (mode == 'C') {
                discount = (double)billAmount * 0.05;
                amountToPay = (double)billAmount - discount;
                System.out.println("Discount is : " + discount);}
            else {
                System.out.println("No discount applicable");
                 amountToPay = (double)billAmount;
            }
            
            System.out.println("Amount to be paid: " + amountToPay);

            
            System.out.println();
        }
    }
}

