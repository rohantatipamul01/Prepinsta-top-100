import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();    
        boolean result=check(number);
        System.out.println(result);
        sc.close();
    }
    static boolean check(int number)
    {
        boolean ter=(number%2==0)?true:false;
        return ter;
    }
}
