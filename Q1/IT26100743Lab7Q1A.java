import java.util.Scanner;

public class IT26100743Lab7Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[4];
        int sum = 0;

        System.out.println("Enter marks for four subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter Subject Mark " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
		
        System.out.println();
		
        double avg = (double) sum / marks.length;
        System.out.println("Average is : " + avg);

        if (avg >= 75) {
            System.out.println("Overall Grade is : Distinction");
        } else if (avg >= 50) {
            System.out.println("Overall Grade is : Credit");
        } else {
            System.out.println("Overall Grade is : Fail");
        }
    }
}
