//Find the Greatest of the Three Numbers in Java
import java.util.Scanner;
public class GreatThree {
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int first=sc.nextInt();
        System.out.println("Enter the Second number: ");
        int second=sc.nextInt();    
        System.out.println("Enter the Third number: ");
        int third=sc.nextInt();
        int result=greatest(first,second,third);
        System.out.println("The Greatest of "+first+", "+second+" and "+third+" is: "+result);
        sc.close();
   } 
   public static int greatest(int first,int second,int third)
   {
        int big=(first>second)?first:second;
        big=(big>third)?big:third;
        return big;
   }
}
