package Problems.BitwiseOperator;

public class numberof1 {
     public static int hammingWeight(int n) {
            int count =0 ;
            while(n!=0){
                if((n & 1) == 1){
                    count ++;
                }
               n = n >> 1;
            }
            return count;
               }

     public static void main(String[] args) {
        // Enter Your Code Here
        int result = hammingWeight(11) ;
        System.out.println(result);
    }
}
