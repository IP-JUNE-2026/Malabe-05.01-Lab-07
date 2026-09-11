import java.util.Scanner;
public class  IT26101724Lab7Q1A{
	public static void main(String[]args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter marks for four subjects:");
	
	System.out.print("Enter Subject Mark 1: ");
	int mark1=sc.nextInt();
	
	System.out.print("Enter Subject Mark 2: ");
	int mark2=sc.nextInt();
	
	System.out.print("Enter Subject Mark 3: ");
	int mark3=sc.nextInt();
	
	System.out.print("Enter Subject Mark 4: ");
	int mark4=sc.nextInt();
	
	double total= (mark1+mark2+mark3+mark4);
	double average=(total/4);
	System.out.println();
	System.out.println("Average is: "+average);
	
	if(average<=100 && 75<=average)
	{
		System.out.println("Overall Grade is: Distinction");
	}
	else if(average<=74 && 50<=average)
	{
		System.out.println("Overall Grade is: Credit");
	}
	else
	{
		System.out.println("Overall Grade is: Fail");
	}
	
}
}