package Patterns;

import java.lang.reflect.Array;

public class pattern9 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for(int i = 1;i<=5;i++){
            System.out.println();
            for(int j=i;j<=5;j++) {
                System.out.print(" ");
            }
                for(int k = 1;k<=i;k++){
                    System.out.print("* ");
                }
        }
    }
}
