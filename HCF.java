// Java Program to find GCD or HCF of two numbers
import java.util.Scanner;
public class HCF {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1=sc.nextInt();
        System.out.println("Enter second number :");
        int num2=sc.nextInt();
        int hcf=factor(num1, num2);
        System.out.println("The HCF of "+num1+" and "+num2+" is "+hcf);
        sc.close();
    }
    static int factor(int num1,int num2)
    {
        int hcf=0;
        for(int i=1;i<num1 || i<num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                hcf=i;
            }
        }
        return hcf;
    }
}
