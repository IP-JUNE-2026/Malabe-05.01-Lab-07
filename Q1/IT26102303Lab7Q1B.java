import java.util.Scanner;

public class IT26102303Lab7Q1B {
    public static void main(String[] args) {
        // Variable declarations at the beginning
        int i;
        double mark1, mark2, mark3, mark4;
        double average;
        String grade;

        // Scanner declared and initialized here instead
        Scanner input = new Scanner(System.in);

        // Loop for three students
        for (i = 1; i <= 3; i++) {
            System.out.print("Student " + i);
            System.out.print("Enter marks: ");
            
            // Reading four space-separated inputs in a single line
            mark1 = input.nextDouble();
            mark2 = input.nextDouble();
            mark3 = input.nextDouble();
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
            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println(); // Prints empty line for spacing
        }

    }
}
