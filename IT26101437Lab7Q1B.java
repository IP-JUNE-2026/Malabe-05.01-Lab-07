 import java.util.Scanner;

public class IT26101437Lab7Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] student1 = new int[4];
		
		 
		int sum = 0;
		String grade;
		Double Average;
		int j;
		for(j=0; j<4; j++){
		System.out.println("student "+(j+1)+":");
		
		
		for(int i =0; i <4;i++){
		System.out.print("Enter marks : ");
        student1[i] = input.nextInt();	
		}

        for(int i =0; i <4;i++){
		sum = sum + student1[i];	
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
}