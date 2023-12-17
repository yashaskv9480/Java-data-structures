package Recursion;

public class sumofdigits {
    public static void main(String[] args) {
        // Enter Your Code Here
        System.out.println(sum(123));
    }

    static int sum(int n) {
        if (n == 0) {
            return 0; // Base case: the sum of digits of 0 is 0
        } else {
            return n % 10 + sum(n / 10);
        }
    }
}
