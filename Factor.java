// Find the Factors of a Number in Java Language
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Factor {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find its factors:");
        int n=sc.nextInt();
        List<Integer> factorList = factors(n);
        System.out.println("Factors of "+n+" are: "+factorList);
        sc.close();
    }
    static List<Integer> factors(int n)
    {
        List<Integer> factorList = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                factorList.add(i);
        }

        return factorList;
    }
}
