public class LCMRecursion {
    public static int lcm(int a, int b) {
        if (b == 0) {
            return a;
        }
        return lcm(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
    }
}