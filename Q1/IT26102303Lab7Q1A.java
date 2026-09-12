import java.util.Scanner;

public class IT26102303Lab7Q1A {
    public static void main(String[] args) {
        // Variable declarations at the beginning
        
        double mark1, mark2, mark3, mark4;
        double average;
        String grade;

        // Initialization and user input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter marks for four subjects:");
        
        System.out.print("Enter Subject Mark 1: ");
        mark1 = input.nextDouble();
        
        System.out.print("Enter Subject Mark 2: ");
        mark2 = input.nextDouble();
        
        System.out.print("Enter Subject Mark 3: ");
        mark3 = input.nextDouble();
        
        System.out.print("Enter Subject Mark 4: ");
        mark4 = input.nextDouble();
        
        // Calculate the average
        average = (mark1 + mark2 + mark3 + mark4) / 4.0;
        
        // Determine the grade
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average <= 74) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }
        
        // Display the results
        System.out.println(" Average is : " + average);
        System.out.println(" Overall Grade is : " + grade);
        
    }
}

