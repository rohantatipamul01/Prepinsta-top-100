import java.util.Scanner;
public class SumN {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int calculatedSum=sum(n);
        System.out.println(calculatedSum);
        sc.close();
    }
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sum(n-1);
    }
}
