import java.util.Scanner;

	public class IT26101343Lab7Q1B {
	
		public static void main(String[] args) {
		
			double sub1;
			double sub2;
			double sub3;
			double sub4;
			double average;
			String overallGrade;
			int count;
			
			
			Scanner marks = new Scanner(System.in);
			
			while (true) {
			
				for(count = 0;count < 3;count++) {
					
				
				System.out.println("Student " + (count+1));
			
				System.out.print("Enter marks for four subjects:");
				
				sub1 = marks.nextDouble();
				sub2 = marks.nextDouble();
				sub3 = marks.nextDouble();
				sub4 = marks.nextDouble();
				
					
					if ( sub1 > 100 || sub1 < 0 || sub2 > 100 || sub2 < 0 ||sub3 > 100 || sub3 < 0 ||sub4 > 100 || sub4 < 0) {
						
						System.out.println("Invalid input.Program closing...");
						return;
						
					}
					
					else {
					
						average = ( sub1 + sub2 + sub3 + sub4 )/4 ;
						
						System.out.println("Average is : " + average);
					
						if ( average >= 75 ) {
						
							overallGrade = "Distinction" ;
							
						
						}
					
						else if ( average <= 74 && average >= 50 ) {
							
							overallGrade = "Credit" ;
							
						}
						
						else {
							
							overallGrade = "Fail" ;
							
						}
						
						System.out.println("Overall Grade : " + overallGrade);
							
					}
					
				System.out.println();
				
				
				}
				
			break;
			}
			
		}
		
	}
	
	
	
					
					
				
				