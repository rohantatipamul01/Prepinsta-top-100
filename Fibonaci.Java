// Find the Fibonacci Series up to Nth Term in Java Language
import java.util.Scanner;
public class Fibonaci {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series:");
        int n=sc.nextInt();
        int[] series = fibo(n);
        System.out.print("Fibonacci series up to "+n+" terms: ");
        for(int num : series)
            System.out.print(num+" ");
        sc.close();
    }
    static int[] fibo(int n)
    {
        int[] series=new int[n];
        series[0]=0;
        series[1]=1;

        return helper(series, n, 2);
    }
    static int[] helper(int[] series, int n, int index)
    {
        if(index==n)
            return series;
        series[index]=series[index-1]+series[index-2];
        return helper(series, n, index+1);
    }
}  