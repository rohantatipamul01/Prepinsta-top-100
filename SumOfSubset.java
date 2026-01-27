//Print sums of all subsets of a given set in Java
public class SumOfSubset {
    public static void main(String[] args) {
        int[] set = {1, 2, 3};
        System.out.println("Subsets and their sums:");
        printSubsetsAndSums(set, 0, "", 0);
    }
    static void printSubsetsAndSums(int[] set, int index, String currentSubset, int currentSum) {
        if (index == set.length) {
            System.out.println("Subset: {" + currentSubset + "} Sum: " + currentSum);
            return;
        }
        // Include the current element
        printSubsetsAndSums(set, index + 1, currentSubset + set[index] + " ", currentSum + set[index]);
        // Exclude the current element
        printSubsetsAndSums(set, index + 1, currentSubset, currentSum);
    }
}
