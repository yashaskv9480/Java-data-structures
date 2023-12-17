//In an array it consists of elements repeated twice but there exists one element that repeats only once


package Problems.BitwiseOperator;

public class one_unique_element_array {
    public static void main(String args[]){
        int[] arr = {2,2,5,3,5,6,7,6,7};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr){
        int unique = 0;
//irrespective of order 
// 2 ^ 5 = 8 ^ 5 = 2 .This is how it works

        for(int n:arr){
            unique = unique ^ n;
        }
        return unique;
    }
}
