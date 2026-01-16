// Check Whether or Not the Number is an Automorphic Number in Java
import java.util.Scanner;
public class AutomorphicNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        if(isAutomorphic(number))
            System.out.println(number+" is an Automorphic Number");
        else
            System.out.println(number+" is not an Automorphic Number");
        sc.close();
    }
    static boolean isAutomorphic(int n)
    {
        int square=n*n;
        if(n%10==square%10)
            return true;
        
        return false;
    }
}
