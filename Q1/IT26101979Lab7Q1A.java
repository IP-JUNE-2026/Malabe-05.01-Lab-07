import java.util.Scanner;
public class IT26101979Lab7Q1A{
    public static void main(String []args){

        int tot=0;
        double avg;
        Scanner y = new Scanner(System.in);
        System.out.println("Enter marks for four subjects:");

        for(int x=0; x<4; x++){
            
            System.out.print("Enter Subject Mark" + (x+1) + ":");
            tot += y.nextInt();

        }

        avg = (double)tot/4;
        System.out.println("Average is:"+ avg);

        if (avg >= 75){
            System.out.println("Overall Grade Is : Distinction");
        }
        else if (avg >= 50){
            System.out.println("Overall Grade Is : Credit");
        }
        else {
            System.out.println("Overall Grade Is : Fail");
        }
    }
}