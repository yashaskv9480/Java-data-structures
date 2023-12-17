package Problems;
import java.util.Arrays;

public class mean_median {
    public static void main(String args[]){
            int a[] = { 1, 3, 4, 2, 7, 5, 8, 6};
            int n = a.length;
             System.out.println(n);

            System.out.println(findMean(a,n));
            System.out.print(findMedian(a,n));
    }
    public static double findMean(int a[],int n){
        double sum =0;
        for(int i=0;i<n;i++){
            sum = sum+a[i];
        }
        return sum/n;
    }
    public static double findMedian(int a[],int n){
        Arrays.sort(a);
        if(n%2 == 0){
            double res = (a[n/2] + a[n/2 -1]) / 2.0;
            return res;
        }
        return a[n/2 - 1];

    }

}
