import java.util.Scanner;
     
public class IT26102303Lab7Q3{
    
	public static void main(String args[]) {
	
	    final double DISCOUNT_RATE = 0.05;
		final int NUMBER_OF_CUSTOMERS = 5;
		
		
		double billAmount, amountToPay;
		char paymentMode;
		
		double discount = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(int customerCount = 1; customerCount <=NUMBER_OF_CUSTOMERS; customerCount++) {
		
		System.out.println("Customer " + customerCount);
		
		
		System.out.print("Enter total bill amount: ");
		billAmount = input.nextDouble();
		
		System.out.print("Enter mode of payment(C for cash, O for others): ");
		paymentMode = input.next().charAt(0);
		
		if(paymentMode == 'C' || paymentMode == 'c') {
		   discount = billAmount * 0.05;
		   amountToPay = billAmount - discount;
		   System.out.println("Discount is : " + discount);
		   System.out.println(" Amount to be paid: " + amountToPay);
		   
		   }
		   
		else if( paymentMode == 'O' || paymentMode == 'o'){
		   discount = 0;
		   amountToPay = billAmount;
		   System.out.println("No discount applicable");
		   System.out.println("Amount to be paid: " + amountToPay);
		   
		}else{
		   System.out.println("Payment mode is not valid");
		      }
			  
		   System.out.println();
		   
		   }
		   
	    }
		
     }
	