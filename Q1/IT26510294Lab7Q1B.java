import java.util.Scanner;

public class IT26510294Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter 4 marks for Student " + i + ": ");

            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();

            int average = (a + b + c + d) / 4;

            if (average >= 75)
                System.out.println("Grade = Distinction");
            else if (average >= 50)
                System.out.println("Grade = Credit");
            else
                System.out.println("Grade = Fail");
        }
    }
}

