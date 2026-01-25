//Write a program to count Number of integers which has exactly X divisors using Java
import java.util.*;
 
class CountDivisor{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int count = 0;
    
        for(int i=1; i<=n; i++){
        
            //variable to count the factors of i-th number
            int count_factors = 0;
            for(int j = 1; j<= i; j++){
                if(i%j==0){
                    count_factors++;
                }
            }
        
        if(count_factors == x)
            count++;
    }
        System.out.println(count);
        sc.close();
    }
}
