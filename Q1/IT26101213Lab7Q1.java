import java.util.Scanner;
  public class IT26101213Lab7Q1{
  public static void main (String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  int i=1;
  double sum=0;
  
  while (i<=4){
  System.out.println("Enter Subject Mark"+ i +":");
  int marks = input.nextInt();
  sum=sum + marks;
   i++;
  }
   
   double avarage= (double)sum/4.0;
   System.out.println("The Average is:"+avarage);
   
   if(avarage>=75){
   System.out.println("Distinction");
   }
   else if(avarage>=50) {
   System.out.println("Credit");
   }
   else{
   System.out.println("Fail");
   }
   
  }
 }
   