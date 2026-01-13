// Find the Reverse of a Number in Java Language
import java.util.Scanner;
public class Reverse {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    int rev=revN(num);
    System.out.println("The Reverse of "+num+" is: "+rev);
    sc.close();
  }  
  static int revN(int num)
  {
    
    if(num==0)
      return 0;

    return helper(num, 0);
    
  }
  static int helper(int num, int rev)
  {
    if(num==0)
      return rev;

    rev=rev*10 + num%10;
    return helper(num/10, rev);
  }
}
