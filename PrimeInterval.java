// Find all the Prime Numbers in a Given Interval in Java
import java.util.Arrays;
import java.util.Scanner;
public class PrimeInterval {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Starting value:");
        int n1=sc.nextInt();    
        System.out.println("Enter the Ending value:");
        int n2=sc.nextInt();
        int result[]=isPrime(n1,n2);
        System.out.println("The Prime Numbers from "+n1+" to "+n2+" are: "+Arrays.toString(result));
        sc.close();

    }   
    static int[] isPrime(int n1,int n2) 
    {
       int size=0;
         for(int i=n1;i<=n2;i++)
         {
              if(isPrimeNumber(i))
              {
                size++;
              }
         }
            int[] primes=new int[size];
            int index=0;
            for(int i=n1;i<=n2;i++)         
            {
                if(isPrimeNumber(i))
                {
                    primes[index]=i;
                    index++;
                }
            }
            return primes;
    }
    static boolean isPrimeNumber(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
