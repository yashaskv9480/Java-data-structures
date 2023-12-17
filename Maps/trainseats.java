import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static int s;
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 108; i++) {
            if(sc.hasNextInt()) {
                int n = sc.nextInt();
                if (n % 12 == 0 || n % 12 == 1) {
                    if (n % 12 == 1) {
                        s = n + 11;
                        System.out.printf("%d WS", s);
                    } else {
                        s = n - 11;
                        System.out.printf("%d WS", s);
                    }
                } else if (n % 12 == 6 || n % 12 == 7) {
                    if (n % 12 == 6) {
                        s = n + 1;
                        System.out.printf("%d WS", s);
                    } else {
                        s = n - 1;
                        System.out.printf("%d WS", s);
                    }
                } else if (n % 12 == 2 || n % 12 == 11) {
                    if (n % 12 == 2) {
                        s = n + 9;
                        System.out.printf("%d MS", s);
                    } else {
                        s = n - 9;
                        System.out.printf("%d MS", s);
                    }
                } else if (n % 12 == 5 || n % 12 == 8) {
                    if (n % 12 == 5) {
                        s = n + 3;
                        System.out.printf("%d MS", s);
                    } else {
                        s = n - 3;
                        System.out.printf("%d MS", s);
                    }
                } else if (n % 12 == 3 || n % 12 == 10) {
                    if (n % 12 == 3) {
                        s = n + 7;
                        System.out.printf("%d AS", s);
                    } else {
                        s = n - 7;
                        System.out.printf("%d AS", s);
                    }
                } else {
                    if (n % 12 == 4) {
                        s = n + 5;
                        System.out.printf("%d AS", s);
                    } else {
                        s = n - 5;
                        System.out.printf("%d AS", s);
                    }
                }
                System.out.println(" ");
            }
        }
    }
}
