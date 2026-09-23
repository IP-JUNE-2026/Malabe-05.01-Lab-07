import java.util.Scanner;

public class IT26510294Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 4 marks: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int average = (a + b + c + d) / 4;

        System.out.println("Average = " + average);

        if (average >= 75)
            System.out.println("Grade = Distinction");
        else if (average >= 50)
            System.out.println("Grade = Credit");
        else
            System.out.println("Grade = Fail");
    }
}

