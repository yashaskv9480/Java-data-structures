package Problems;

import java.util.Arrays;


public class missingandrepeating {

    public static void findMissingAndRepeating(int[] arr) {
        Arrays.sort(arr);

        int repeating = 0, missing = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                repeating = arr[i];
            }
            if (arr[i + 1] - arr[i] > 1) {
                missing = arr[i] + 1;
            }
        }
        if (arr[arr.length - 1] != arr.length) {
            missing = arr.length;
        }

        System.out.println("Missing = " + missing + ", Repeating = " + repeating);
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 3};
        findMissingAndRepeating(arr1);

        int[] arr2 = {4, 3, 6, 2, 1, 1};
        findMissingAndRepeating(arr2);
    }
}