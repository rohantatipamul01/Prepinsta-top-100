// Octal to decimal conversion using Java
import java.util.Scanner;
public class OctalToDecimal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the octal value :");
        int octal=sc.nextInt();
        int result=toDecimal(octal);
        System.out.println(result);
        sc.close();
    }
    static int toDecimal(int octal)
    {
        int decimal=0;
        int n=0;
        while(octal>0)
        {
            int temp=octal%10;
            decimal+=temp*Math.pow(8,n);
            octal=octal/10;
            n++;

        }
       return decimal;
    }
}
