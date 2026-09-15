import java.util.Scanner;

public class IT26100743Lab7Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int s = 1; s <= 3; s++) {
            System.out.println("Student " + s);
            System.out.print("Enter marks: ");
            int marks[] = new int[4];
            int sum = 0;

            for (int i = 0; i < marks.length; i++) {
                marks[i] = sc.nextInt();
                sum += marks[i];
            }
            
            double avg = (double) sum / marks.length;
            System.out.println("Average is : " + avg);

            if (avg >= 75) {
                System.out.println("Overall Grade is : Distinction");
            } else if (avg >= 50) {
                System.out.println("Overall Grade is : Credit");
            } else {
                System.out.println("Overall Grade is : Fail");
			}
			
			System.out.println();
				
        }
    }
}
