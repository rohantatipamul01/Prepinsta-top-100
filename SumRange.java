// Find the Sum of the Numbers in a Given Interval in Java
import java.util.Scanner;
public class SumRange {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ennter the Starting value:");
        int n1=sc.nextInt();
        System.out.println("Enter the Ending value:");
        int n2=sc.nextInt();
        int result =sum(n1,n2);
        System.out.println("The Sum of Numbers from "+n1+" to "+n2+" is: "+result);
        sc.close();
    }
    static int sum(int n1,int n2)
    {
        if(n1>n2)
        {
            return 0;
        }
        return n1+sum(n1+1,n2);
    }
}
