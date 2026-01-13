// Find the Armstrong Numbers in a given Range using Java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ArmstrongRange {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number of the range:");
        int start=sc.nextInt();
        System.out.println("Enter the ending number of the range:");
        int end=sc.nextInt();
        List<Integer> armstrongNumbers = range(start, end);
        System.out.println("Armstrong numbers between "+start+" and "+end+" are: "+armstrongNumbers);
        sc.close();
    }
    static List<Integer> range(int start, int end)
    {
        List<Integer> list = new ArrayList<>();
        for(int i=start; i<=end; i++)
        {
            if(isArmstrong(i))
                list.add(i);
        }
        return list;
    }
    static boolean isArmstrong(int num)
    {
        int sum = helper(num, 0, String.valueOf(num).length());
        return sum == num;
    }
    static int helper(int num, int sum, int len)
    {
        if(num==0)
            return sum;
        sum += Math.pow(num%10, len);
        return helper(num/10, sum, len);
    }
}
