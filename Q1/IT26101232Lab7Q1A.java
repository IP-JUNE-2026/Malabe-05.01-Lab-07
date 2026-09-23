import java.util.Scanner;

public class IT26101232Lab7Q1A{

   public static void main(String[] args){
   
   Scanner scanner = new Scanner(System.in);
   
   double mark1,mark2,mark3,mark4,average;
   String grade;
   
   System.out.println("Enter marks for four subjects:");
   
   System.out.print("Enter Subject Mark 1: ");
   mark1 = scanner.nextDouble();
   
   System.out.print("Enter Subject Mark 2: ");
   mark2 = scanner.nextDouble();
   
   System.out.print("Enter Subject Mark 3: ");
   mark3 = scanner.nextDouble();
   
   System.out.print("Enter Subject Mark 4: ");
   mark4 = scanner.nextDouble();
   
   average = (mark1 + mark2 + mark3 + mark4)/4.0;
   System.out.println();
   System.out.println("Average is : " + average);
   
   if(average >= 75.0 && average <=100.0){
	   grade = "Distinction";
   }else if(average >= 50.0 && average < 75.0){
	   grade = "Credit";
   }else{
	   grade = "Fail";
   }
   
   System.out.println("Overall Grade is : " + grade);
   
   }


}