import java.util.Scanner;

public class IT26101219Lab7Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for four subjects:");
        System.out.print("Enter Subject Mark 1: ");
        double mark1 = sc.nextDouble();
        System.out.print("Enter Subject Mark 2: ");
        double mark2 = sc.nextDouble();
        System.out.print("Enter Subject Mark 3: ");
        double mark3 = sc.nextDouble();
        System.out.print("Enter Subject Mark 4: ");
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

        System.out.println();
        System.out.println("Average is : " + average);
        System.out.println("Overall Grade is : " + grade);

        sc.close();
    }
}