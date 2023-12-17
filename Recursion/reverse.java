package Recursion;

public class reverse {
    public static void main(String[] args) {
        // Enter Your Code Here
        System.out.println(reverser(123));
    }

    static int reverser(int n) {
        if (n == 0) {
            return 0; // Base case: the reverse of digits of 0 is 0
        } else {
            return n % 10 + reverser(n / 10);
        }
    }
}
