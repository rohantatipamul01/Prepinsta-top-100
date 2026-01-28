
// Find the Nth row in Pascal’s Triangle in Java
import java.util.Scanner;
public class NthPascal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number (N) to find in Pascal's Triangle:");
        int n = sc.nextInt();
        System.out.print("Row " + n + " of Pascal's Triangle is: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(pascal(n, i) + " ");
        }
        sc.close();
    }
    static int pascal(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return pascal(n - 1, k - 1) + pascal(n - 1, k);
    }
}