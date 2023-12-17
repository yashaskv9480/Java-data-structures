package Sort;
import java.util.Arrays;

public class mergesort {
    public static void main(String args[]){
        int[] arr = {5,4,2,1,4};
        int[] ans = mergesorts(arr);
        System.out.println(Arrays.toString(ans));
    }

    //divide the array
    public static int[] mergesorts(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int left[] = mergesorts(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergesorts(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    } 
    // conquer the array based on comparison
    public static int[] merge(int[] left,int[] right){
        int[] mix = new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;

        //Sorting 
        while(i< left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }
            else{
                mix[k] = right[j];
                j++;
            }
            k++;
         }
         // if i >> j or j >> i
         // we add remaining sorted elements to the array 
         while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
         }

          while(j < right.length){
            mix[k] = right[j];
            j++;
            k++;
         }
         return mix;
    }
}
