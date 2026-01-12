// Find the Greatest of the Two Numbers in Java
import java.util.Scanner;
public class GreatestTwo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int first=sc.nextInt();
        System.out.println("Enter the Second number: ");
        int second=sc.nextInt();
        int result=greatest(first,second);
        System.out.println("The Greatest of "+first+" and "+second+" is: "+result);
        sc.close();
    }
    static int greatest(int first,int second)
    {
        int big=(first>second)?first:second;
        return big;
    }
}
