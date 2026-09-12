import java.util.Scanner;

public class IT26101232Lab7Q1B{

   public static void main(String[] args){
   
   Scanner scanner = new Scanner(System.in);
   
   double mark1,mark2,mark3,mark4,average;
   String grade;
   int numOfStudents;
   
   for(numOfStudents = 1; numOfStudents <=3; numOfStudents++){
	   System.out.println("Student " + numOfStudents);
	   System.out.print("Enter marks: ");
	   
	   mark1 = scanner.nextDouble();
	   mark2 = scanner.nextDouble();
	   mark3 = scanner.nextDouble();
	   mark4 = scanner.nextDouble();
	   
	   average = (mark1 + mark2 + mark3 + mark4)/4.0;
	   System.out.println("Average is : " + average);
	   
		if(average >= 75.0 && average <=100.0){
	   grade = "Distinction";
		}else if(average >= 50.0 && average < 75.0){
	   grade = "Credit";
		}else{
	   grade = "Fail";
		}
   
		System.out.println("Overall Grade is : " + grade);
		System.out.println();
   }
         
      
   
   
   }


}