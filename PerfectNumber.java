// Check Whether or Not the Number is a Perfect Number in Java Language
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        if(isPerfect(number))
            System.out.println(number+" is a Perfect Number");
        else
            System.out.println(number+" is not a Perfect Number");
        sc.close();
    }
    static boolean isPerfect(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        return sum==n;
    }
}
