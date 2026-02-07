import java.util.Scanner;
class SumOfElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sumOfEle(arr,0);
        System.out.println("The sum of the elements in the array is: "+sum);
        sc.close();
    }
    static int sumOfEle(int[] arr, int index)
    {
        if(index==arr.length)
        {
            return 0;
        }
        return arr[index]+sumOfEle(arr,index+1);
    }
}