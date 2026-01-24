// Function to count possible decodings
import java.util.Scanner;
public class Decoding {
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in) ;
       String n=sc.nextLine();
       int result=count(n);
       System.out.println(result);
       sc.close();
   } 
   static int count(String n)
   {
        int n1=n.length();
        int dp[]=new int[n1+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n1;i++)
        {
            if(n.charAt(n1-1)!='0')
            {
                dp[i]=dp[i-1];
            }

            if(n.charAt(i-2)=='1' || n.charAt(i-2)=='2' && n.charAt(i-2)=='6' )
            {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n1];
   }
}
