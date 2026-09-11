import java.util.Scanner;
public class IT26101979Lab7Q1B{
    public static void main(String []args){
       
        Scanner y = new Scanner(System.in);
        
        for (int w=1; w<4; w++){

            int tot = 0;

            System.out.println("student "+ w );
            System.out.print("Enter 4 marks seperated by space: ");
            
            for (int i = 0; i < 4; i++){
                tot += y.nextInt();
            }
            
            double avg = (double)tot/4;

            System.out.println("Average is: "+ avg);

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
}