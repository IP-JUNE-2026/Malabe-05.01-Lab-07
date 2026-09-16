import java.util.Scanner;

public class IT26101243Lab7Q1B {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {

            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            int marks[] = new int[4];
            int sum = 0;

            for (int i = 0; i < marks.length; i++) {

                marks[i] = scanner.nextInt();
                sum = sum + marks[i];

            }

            System.out.println("") ;

            double average = (double) sum / marks.length;
            System.out.println("Average is: " + average);

            if (average >= 75) {
                System.out.println("Overall Grade is: Distinction");

            } else if (average >= 50) {
                System.out.println("Overall Grade is: Credit");
                
            } else {
                System.out.println("Overall Grade is: Fail");
            }

            System.out.println();
        }
    }
}