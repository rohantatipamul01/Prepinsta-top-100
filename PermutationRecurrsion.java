public class PermutationRecurrsion {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("Permutations of " + str + " are:");
        generatePermutations(str, "");
    }
    static void generatePermutations(String str, String current) {
        if (str.isEmpty()) {
            System.out.println(current);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, current + ch);
        }
    }
}
