// Program to calculate GCD of Two Numbers in Java
import java.util.Scanner;
public class GCD {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Value :");
        int n1=sc.nextInt();
        System.out.println("Enter the second value :");
        int n2=sc.nextInt();
        int result=find(n1,n2);
        System.out.println(result);
        sc.close();
    }
    static int find(int n1,int n2)
    {
        int gcd=0;
        for(int i=1;i<n1 || i<n2;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
}
