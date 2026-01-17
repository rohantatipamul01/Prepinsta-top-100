// Harshad number or not using Java
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        if(isHarshad(number))
            System.out.println(number+" is a Harshad Number");
        else
            System.out.println(number+" is not a Harshad Number");
        sc.close();
    }
    static boolean isHarshad(int n)
    {
        int sum=0;
        int temp=n;
        while(temp>0)
        {
            sum=sum+temp%10;
            temp=temp/10;
        }
        return (n%sum==0);
    }
}
