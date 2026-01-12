// Write a program to check if a given number is prime or not in java using recursion
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        boolean result=isPrime(num);
        System.out.println("Is the Number "+num+" a Prime Number? : "+result);
        sc.close();
    }
    static boolean isPrime(int num)
    {
        return isPrimeHelper(num,2);
    }
    static boolean isPrimeHelper(int num, int divisor)
    {
        if(num<=2)
        {
            return (num==2)?true:false;
        }
        if(num%divisor==0)
        {
            return false;
        }
        if(divisor*divisor>num)
        {
            return true;
        }
        return isPrimeHelper(num,divisor+1);
    }
}
