// Program for Finding out the Prime Factors of a number in Java

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class PrimeFactors {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find its prime factors:");
        int number=sc.nextInt();
        System.out.println("Prime factors of "+number+" are:");
        int[] factors = primeFactors(number);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        sc.close();
    }
    static int[] primeFactors(int n)
    {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {  
            while (n % i == 0) {  
                factors.add(i); 
                n /= i; 
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors.stream().mapToInt(i -> i).toArray();
    }
}
