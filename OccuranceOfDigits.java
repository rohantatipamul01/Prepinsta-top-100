// Occurrence of a digit in a given number using Java
import java.util.Scanner;
public class OccuranceOfDigits {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number=sc.nextInt();
        System.out.println("Enter the digit :");
        int digit = sc.nextInt();
        int count=Occurrence(number, digit);
        System.out.println(count);
        sc.close();
        
    }
    static int Occurrence(int number,int digit)
    {
        int count=0;
        while(number>0)
        {
            int val=number%10;
            if(val==digit)
            {
                count++;
            }
            number=number/10;
        }
        return count;
    }
}
