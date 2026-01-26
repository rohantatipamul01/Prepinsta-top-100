public class HCFRecurrsion {
    public static void main(String[] args) {
        int num1 = 48, num2 = 18;
        int hcf = findHCF(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
    static int findHCF(int a, int b) {
        if (b == 0)
            return a;
        return findHCF(b, a % b);
    }
}