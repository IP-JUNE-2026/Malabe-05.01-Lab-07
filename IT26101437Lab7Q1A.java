 import java.util.Scanner;

public class IT26101437Lab7Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[4];
		int sum = 0;
		String grade;
		Double Average;
		for(int i =0; i <4;i++){
		System.out.print("Enter number " + (i + 1) + ": ");
        myArray[i] = input.nextInt();	
		}

        for(int i =0; i <4;i++){
		sum = sum +  myArray[i];	
		}
		  Average = sum/4.0;
	
		System.out.println(" Average is :" + Average);

          if (Average >= 75) {
            grade = "Distinction";
        } 
        else if (Average >= 50) {
            grade = "Credit";
        } 
        else {
            grade = "Fail";
        }
        System.out.println("Overall Grade is : " + grade);
 
    }
}