import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of radius : ");
        int r=sc.nextInt();
        double result=Area(r);
        System.out.println(result);
        sc.close();
    }
    static double Area(int r)
    {
        return (3.14*r*r);
    }
}
