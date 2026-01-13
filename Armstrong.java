// Check Whether or Not the Number is an Armstrong Number

import java.util.Scanner;

public class Armstrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int sum=isArmstrong(num);
        if(sum==num)
            System.out.println(num+" is an Armstrong Number");
        else
            System.out.println(num+" is not an Armstrong Number");
        sc.close();
    }
    static int isArmstrong(int num)
    {
        int sum = helper(num, 0, String.valueOf(num).length());
        return sum;
    }
    static int helper(int num, int sum, int len)
    {
        if(num==0)
            return sum;
        sum += Math.pow(num%10, len);
        return helper(num/10, sum, len);
    }

}