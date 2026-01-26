public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 4};
        int max = findMax(arr, arr.length);
        System.out.println("The maximum element is: " + max);
    }
    static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }
}
