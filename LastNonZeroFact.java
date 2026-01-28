// Last non-zero digit in factorial in Java
import java.util.Scanner;
public class LastNonZeroFact {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the last non-zero digit of its factorial:");
        int n=sc.nextInt();
        int result = findLastNonZeroDigit(n);
        System.out.println("The last non-zero digit in " + n + "! is: " + result);
        sc.close();
    }
    static int findLastNonZeroDigit(int n)
    {
        int fact=factorial(n);
        while(fact%10==0)
        {
            fact=fact/10;
        }
        return fact%10;
    }
    static int factorial(int n)
    {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n*factorial(n-1);
    }
}
