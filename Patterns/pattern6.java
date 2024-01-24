package Patterns;

public class pattern6 {
    public static void main(String[] args) {
        printpattern(5);
    }

    public static void printpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++) {
                System.out.print("k");
            }
            System.out.println();
        }
    }
}
