import java.util.Scanner;
public class PrimeRecurrsion {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        int num=sc.nextInt();
        if (isPrime(num, 2))
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        sc.close();
    }
    static boolean isPrime(int num,int i)
    {
        if (num <= 2)
            return (num == 2) ? true : false;
        if (num % i == 0)
            return false;
        if (i * i > num)
            return true;
        return isPrime(num, i + 1);
    }
}
