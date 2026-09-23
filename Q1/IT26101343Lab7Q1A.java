import java.util.Scanner;

	public class IT26101343Lab7Q1A {
	
		public static void main(String[] args) {
		
			double sub1;
			double sub2;
			double sub3;
			double sub4;
			double average;
			String overallGrade;
			
			Scanner marks = new Scanner(System.in);
			
			
			
			System.out.println("Enter marks for four subjects.");
			
			System.out.print("Enter subject mark 1 : ");
			sub1 = marks.nextDouble();
			
			System.out.print("Enter subject mark 2 : ");
			sub2 = marks.nextDouble();
			
			System.out.print("Enter subject mark 3 : ");
			sub3 = marks.nextDouble();
			
			System.out.print("Enter subject mark 4 : ");
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
			
				else if  ( average <= 74 && average >= 50 ) {
					
					overallGrade = "Credit" ;
					
				}
				
				else {
					
					overallGrade = "Fail" ;
					
				}
				
				System.out.println("Overall Grade : " + overallGrade);
				
			}
			
		}
		
	}
					
					
				
				