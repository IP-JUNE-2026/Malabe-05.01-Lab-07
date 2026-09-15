import java.util.Scanner;

public class IT26101219Lab7Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            double mark1 = sc.nextDouble();
            double mark2 = sc.nextDouble();
            double mark3 = sc.nextDouble();
            double mark4 = sc.nextDouble();

            double average = (mark1 + mark2 + mark3 + mark4) / 4;

            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }

        sc.close();
    }
}