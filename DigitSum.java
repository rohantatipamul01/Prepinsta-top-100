// Find the Sum of the Digits of a Number in Java Language
import java.util.Scanner;
public class DigitSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int result=SumOfDigits(num);
        System.out.println("The Sum of the Digits of "+num+" is: "+result);
        sc.close();
    }
    static int SumOfDigits(int num)
    {
        int sum=0;
        if(num==0)
        {
            return sum;
        }
        return sum+num%10 + SumOfDigits(num/10);
    }
}
