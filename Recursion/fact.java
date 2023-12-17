package Recursion;

public class fact {
    public static void main(String[] args) {
        // Enter Your Code Here
        System.out.println(facto(5));

    }
    static int facto(int n){
        if (n<= 1){
            return 1;
        }
        return n * facto( n -1);
    }
    
}
