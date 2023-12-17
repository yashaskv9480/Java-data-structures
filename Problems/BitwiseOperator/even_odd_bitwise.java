package Problems.BitwiseOperator;

public class even_odd_bitwise {
    public static void main(String args[]){
        int n = 21;
        boolean ans = checkodd_even(n);
        if(ans){
            System.out.println("Odd number");
        }
        else{
            System.out.println("Even number");
        }

    }
    
    public static boolean checkodd_even(int n){
        if((n & 1) == 1){
            return true;
        }
        return false;
    }

    }

