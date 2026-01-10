// Check if a Number is Positive or Negative in Java
import java.util.Scanner;
class PositiveNegative{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number>0)
        {
            System.out.println("Positive Number");
        }
        else if(number<0)
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}