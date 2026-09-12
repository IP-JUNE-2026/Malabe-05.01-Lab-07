import java.util.Scanner;

public class IT26101232Lab7Q3{

   public static void main(String[] args){
   
   Scanner scanner = new Scanner(System.in);
   
   int customerCount;
   double billAmount,discount,amountToPay;
   char paymentMode;
   final double DISCOUNT_RATE = 0.05;
   
   for(customerCount = 1; customerCount <= 5; customerCount++){
	   
	   System.out.println("Customer " + customerCount);
	   
	   System.out.print("Enter total bill amount: ");
	   billAmount = scanner.nextDouble();
	   
	   System.out.print("Enter mode of payment (C for cash, O for other): ");
	   paymentMode = scanner.next().toUpperCase().charAt(0);
	   
	   if(paymentMode == 'C'){
		   
		 discount = billAmount * DISCOUNT_RATE;
		 amountToPay = billAmount - discount;
		 
		 System.out.println("Discount is : " + discount);
		 System.out.println("Amount to be paid: " + amountToPay);
	   }
	   else if(paymentMode == 'O'){
		   
		   System.out.println("No discount applicable");
		   System.out.println("Amount to be paid: " + billAmount);
	   }else{
		   
		   System.out.println("Payment Mode is Not Valid");
		   
	   }
	   System.out.println();
   }
   
   
   }


}