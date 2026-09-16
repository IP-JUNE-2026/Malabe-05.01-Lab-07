import java.util.Scanner;

public class IT26101243Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int marks[] = new int[4];
        int sum = 0;

        System.out.println("Enter marks for four subjects:");
        for (int i = 0; i < marks.length; i++) {

            System.out.print("Enter Subject Mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum = sum + marks[i];
            
        }

        System.out.println("") ;

        double average = (double) sum / marks.length;
        System.out.println("Average is: " + average);

        if (average >= 75 && average <= 100) {
                System.out.println("Overall Grade is: Distinction");
        } 
            else if (average >= 50 && average <= 74) {
                System.out.println("Overall Grade is: Credit");
        } 
            else if (average >= 0 && average <= 49) {
                System.out.println("Overall Grade is: Fail");
        }
    }
}