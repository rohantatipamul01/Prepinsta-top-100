// Reverse an Array in Java
import java.util.Scanner;
public class ReverseArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        int reversedArr[] = reverse(arr);
        System.out.println("Reversed Array:");
        for(int i=0; i<reversedArr.length; i++)        {
            System.out.print(reversedArr[i] + " ");
        }
        sc.close();
        
    }
    static int[] reverse(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        return arr;
    }
}
