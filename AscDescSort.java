import java.util.*;

public class AscDescSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // Sort full array ascending

        int mid = n / 2;

        int[] result = new int[n];

        // Two pointers
        int i = 0;        // start pointer
        int j = n - 1;    // end pointer
        int index = 0;

        // First half ascending
        while (i < mid) {
            result[index++] = arr[i++];
        }

        // Second half descending
        while (j >= mid) {
            result[index++] = arr[j--];
        }

        System.out.println("Sorted Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
