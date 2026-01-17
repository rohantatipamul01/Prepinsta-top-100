// Check Whether or Not the Number is an Abundant Number in Java Language
import java.util.Scanner;
public class AbudantNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        if(isAbundant(number))
            System.out.println(number+" is an Abundant Number");
        else
            System.out.println(number+" is not an Abundant Number");
        sc.close();
    }
    static boolean isAbundant(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        return (sum>n);
    }
}
