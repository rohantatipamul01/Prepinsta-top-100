// Counting number of days in a given month of a year
import java.util.Scanner;
public class DaysInMonth {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year :");
        int year=sc.nextInt();
        System.out.println("`Enter the month :");
        int month=sc.nextInt();
        int num=Days(year, month);
        System.out.println("month has "+num);
        sc.close();
    }
    static int Days(int year,int month)
    {
        if(month==2 && (year%4==0) || year%400==0 || year%100==0)
        {
            return 29;
        }
        if(month==2)
        {
            return 28;
        }
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
        {
            return 31;
        }
        return 30;
    }
}
