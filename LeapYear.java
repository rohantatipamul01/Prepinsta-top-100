// Check Whether or Not the Year is a Leap Year in Java
import java.util.Scanner;
public class LeapYear {
  public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year=sc.nextInt();
        boolean result=isLeap(year);
        System.out.println("Is the Year "+year+" a Leap Year? : "+result);
        sc.close();
  }  
  static boolean isLeap(int year)
  {
    boolean result=(year%4==0 & year%100!=0)?true:false;
    return result;
  }
}
