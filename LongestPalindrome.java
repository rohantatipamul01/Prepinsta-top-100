// Java program for longest palindrome in an array

import java.util.*;

public class LongestPalindrome {
    public static void main(String args[])
    {
        int arr[]={1,2,54,565,222333};
        int res=longestPalindrome(arr);
        if(res==-1)
        {
            System.out.println("No palindrome found");
        }
        else
        {
            System.out.println("Longest palindrome is: "+res);
        }

    }
    static int longestPalindrome(int arr[])
    {
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==reverse(arr[i]))
            {
                return arr[i];
            }
        }
        return -1;
    }
    static int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
}
