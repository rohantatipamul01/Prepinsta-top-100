// Given an integer N the task is to print the F(N)th term in Java
public class NthTerm {
    public static void main(String[] args) {
        int N = 5; // Example input
        System.out.println("The " + N + "th term is: " + findNthTerm(N));
    }   
    static int findNthTerm(int N) {
        if (N == 1) {
            return 1;
        } else if (N % 2 == 0) {
            return N + findNthTerm(N - 1);
        } else {
            return N * findNthTerm(N - 1);
        }
    }
}
