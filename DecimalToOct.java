
// Decimal to octal conversion using Java
import java.util.Scanner;

public class DecimalToOct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toOctal(n);
        sc.close();

    }

    public static int toOctal(int n)
    {
        String s = "";
        while(n != 0)
        {

        int rem = n % 8;
        s = rem + s;
        n = n / 8;
        //System.out.println(s);

        }
        System.out.println(s);
        int m = Integer.parseInt(s);

        return m;
    }
}
