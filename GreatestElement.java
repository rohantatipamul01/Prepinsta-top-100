// Java Program for finding the largest element of the array
import java.util.Scanner;
public class GreatestElement {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter the size of array:");
       int n=sc.nextInt();
         int arr[]=new int[n];
         System.out.println("Enter the elements of array:");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            sc.close();
            int result=largest(arr);
            System.out.println("The largest element in the array is: "+result);
    }
    static int largest(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
