import java.util.Scanner;

	public class IT26101906Lab7Q1B {
	
		public static void main(String[] args){
		
			Scanner input = new Scanner(System.in);
			
			for(int student = 1; student  <= 3; student++){
			
			System.out.println("Stident" + student );
			System.out.print("Enter marks :");
			
			double total = 0;
			for(int i = 0; i < 4; i++){
			}
			
			double average = total / 4;
			
			System.out.println("Average is : " + average);
			
			if (average >= 75) {
                System.out.println("Overall Grade is : Distinction");
            } else if (average >= 50) {
                System.out.println("Overall Grade is : Credit");
            } else {
                System.out.println("Overall Grade is : Fail");
            }
            System.out.println();

			
			}
		
		}
	
	}