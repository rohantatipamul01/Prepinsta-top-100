public class CalculateLength {
    public static int calculateLength(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        return 1 + calculateLength(str.substring(1));
    }

    public static void main(String[] args) {
        String input = "Hello";
        System.out.println("Length of \"" + input + "\" is: " + calculateLength(input));
    }
}