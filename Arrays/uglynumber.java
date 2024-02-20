package Arrays;

import java.util.ArrayList;

public class uglynumber {
    public static void main(String[] args) {
            int n,a,b,c;
        System.out.println(nthUglynumber(1000000000,2,217983653,336916467));

    }
    public static int nthUglynumber(int n, int a, int b, int c) {
        int max = Integer.MAX_VALUE;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<=max;i++){
            if(i%a == 0 || i%b == 0 || i%c == 0){
                if(arr.size() <= n) {
                    arr.add(i);
                }
                else{
                    return arr.get(n);
                }
            }
        }
        return 1;
    }

}
