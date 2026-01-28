// Generate all Combinations of Balanced Parentheses in Java
class BalancedParentheses {
    public static void main(String[] args) {
        int n = 3; // Number of pairs of parentheses
        System.out.println("All combinations of balanced parentheses for " + n + " pairs:");
        generateParentheses("", n, n);
    }

    static void generateParentheses(String current, int open, int close) {
        if (open == 0 && close == 0) {
            System.out.println(current);
            return;
        }
        if (open > 0) {
            generateParentheses(current + "(", open - 1, close);
        }
        if (close > open) {
            generateParentheses(current + ")", open, close - 1);
        }
    }
}