// Check Whether or Not the Given Number is a Strong Number in Java Language
import java.util.Scanner;
public class StrongNumber {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number :");
            int number=sc.nextInt();
            if(isStrongNumber(number))
                System.out.println(number+" is a Strong Number");
            else
                System.out.println(number+" is not a Strong Number");
            sc.close();

        }  
        static boolean isStrongNumber(int n)
        {
            int sum=0;
            int temp=0;
            int originalNumber=n;
            while(n>0)
            {
                temp=n%10;
                sum=sum+factorial(temp);
                n=n/10;
            }
            return sum==originalNumber;
        }
        static int factorial(int num)
        {
            if(num==0 || num==1)
                return 1;
            int fact=1;
            for(int i=2;i<=num;i++)
            {
                fact=fact*i;
            }
            return fact;
        }
}
