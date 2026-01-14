// Power of a Number in Java
import java.util.Scanner;
import java.lang.Math;
public class PowerOfNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base number:");
        int base=sc.nextInt();
        System.out.println("Enter the exponent:");
        int exponent=sc.nextInt();
        double result = power(base, exponent);
        System.out.println(base+" raised to the power "+exponent+" is: "+result);
        sc.close();
    }
    static double power(int base, int exponent)
    {
        if(exponent==0)
            return 1;
        return Math.pow(base, exponent);
    }
}
