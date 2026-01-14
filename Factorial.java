// Factorial of a Number in Java
import java.util.Scanner;
public class Factorial {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result = fact(n);
        System.out.println("Factorial of "+n+" is: "+result);
        sc.close();
    }
    static int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
}
