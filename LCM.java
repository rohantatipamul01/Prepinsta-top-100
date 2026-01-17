
// LCM of two numbers using Java
import java.util.Scanner;

public class LCM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value :");
        int num1 = sc.nextInt();
        System.out.println("Enter the second value :");
        int num2 = sc.nextInt();
        int l = factor(num1, num2);
        System.out.println("The LCM is " + l);
        sc.close();
    }

    static int factor(int num1,int num2)
    {
        int lcm=0;
        int max = (num1 > num2) ? num1 : num2;
        for (int i = max; i <= num1 * num2; i++)
        {
            if (i % num1 == 0 && i % num2 == 0)
            {
                lcm = i;
                break;
            }
        }
        return lcm;
    }
}
