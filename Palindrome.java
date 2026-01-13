// Check Whether or Not the Number is a Palindrome in Java Language

import java.util.Scanner;
public class Palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int rev=isPalindrome(num);
        if(rev==num)
            System.out.println(num+" is a Palindrome Number");
        else
            System.out.println(num+" is not a Palindrome Number");
        sc.close();
        
    }
    static int isPalindrome(int num)
    {
        
        return helper(num, 0);
    }
    static int helper(int num,int rev)
    {
        if(num==0)
            return rev;
        
        rev=rev*10 + num%10;
        return helper(num/10, rev);
    }
}
