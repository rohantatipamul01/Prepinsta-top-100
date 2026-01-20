// Binary to decimal conversion using Java
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary :");
        int binary=sc.nextInt();
        int result=toDecimal(binary);
        System.out.println(result);
        sc.close();

    }
    static int toDecimal(int binary)
    {
        int decimal=0;
        int n=0;
        while(binary>0)
        {
            int temp = binary%10; 
			decimal += temp*Math.pow(2, n);  
			binary = binary/10;  
			n++; 
        }
        return decimal;
    }
}
