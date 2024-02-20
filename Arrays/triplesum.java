package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class triplesum {
    public static int solve(ArrayList<Integer> A) {
        int n = A.size();
        System.out.println(n);
        int sum = 0;
        if(n<3){
            return 0;
        }
        Collections.sort(A);
        System.out.println(A.get(n-1));
        for(int i=n-1;i>=n-3;i--){
            sum = sum + A.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(3);
        arr.add(1);
        arr.add(4);
        arr.add(9);
        System.out.println(solve(arr));
    }
}
