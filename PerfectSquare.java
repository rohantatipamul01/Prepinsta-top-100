// Check Whether or Not the Number is a Perfect Square Number in Java Language
import java.util.Scanner;
public class PerfectSquare {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        if(isPerfectSquare(number))
            System.out.println(number+" is a Perfect Square Number");
        else
            System.out.println(number+" is not a Perfect Square Number");
        sc.close();
    }
    static boolean isPerfectSquare(int n)
    {
        int sqrt=(int)Math.sqrt(n);
        return (sqrt*sqrt)==n;
    }
}
