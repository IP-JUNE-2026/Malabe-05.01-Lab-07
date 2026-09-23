import java.util.Scanner;
public class IT26101437Lab7Q3 {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
	int i ;
	   
	char letter;
	double amount,Discout = 0.0;
	for(i=0;i<5;i++){
		System.out.print("Customer"+(i+1) +"\n");
		
		System.out.print("Enter total bill amount: ");
		    amount = input.nextInt();
		
		System.out.print("Enter mode of payment (C for cash,O for other): ");
		letter = input.next().charAt(0);
		
		if(letter == 'C' || letter == 'c'){
			  Discout = amount * (5.0 / 100.0);
			System.out.print("Discount is:"+ Discout +"\n");
		}
		else if(letter == 'O' || letter == 'o'){
			System.out.print(" no Discount"+"\n");
		}
		else{
			System.out.print(" payment mode is not valid"+"\n");
		}
		double nettotal =   amount -  Discout;
		System.out.print(" Amount to be paid "+nettotal +"\n");
		
	  }
    }
}