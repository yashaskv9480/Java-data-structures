package Problems.BitwiseOperator;
public class check_i_element_value {
    public static void main(String args[]){
        int n = 26;
        int index = 2;
        System.out.println(getindex(n,index -1)); // index -1 to perform left shift 
        if(getindex(n,index -1) == 0){
            System.out.println(changeindexto1(n,index -1));

        }
        else{   
           System.out.println(changeindexto0(n,index -1));

        }
    }
    private static int getindex(int n,int k){
        int result = (n & (1 << k));
        return (result != 0) ? 1 : 0; //will show the 2power value instead of 1 

    }
    private static int changeindexto0(int n,int k){
        int result = (n & ~(1 << k));   
        return result;
    }

    private static int changeindexto1(int n,int k){
        int result = (n | (1 << k));
        return result;
    }
}
