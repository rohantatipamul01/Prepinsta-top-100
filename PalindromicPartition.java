// Find all possible Palindromic Partitions of the given String in Java
public class PalindromicPartition {
    public static void main(String[] args) {
        String str = "aab";
        System.out.println("All possible palindromic partitions of the string \"" + str + "\":");
        printPalindromicPartitions(str, "", 0);
    }
    static void printPalindromicPartitions(String str, String currentPartition, int index) {
        if (index == str.length()) {
            System.out.println(currentPartition);
            return;
        }
        for (int i = index + 1; i <= str.length(); i++) {
            String prefix = str.substring(index, i);
            if (isPalindrome(prefix)) {
                printPalindromicPartitions(str, currentPartition + prefix + " | ", i);
            }
        }
    }
    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
