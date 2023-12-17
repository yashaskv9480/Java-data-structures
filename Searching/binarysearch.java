package Searching;

public class binarysearch {
    public static void main(String args[]){
        int arr[] = {10,20,30,40};
        int target = 120;
        int result = search(arr,target);
        if(result == -1){
           System.out.println("Doesnt exist"); 
        }
        else{
            System.out.println(result);
        }

    }

    static int search(int arr[],int target){
        int low =0;
        int high = arr.length - 1;

        while(low < high){

           int mid = (low + high) / 2;
           if(arr[mid] > target){
            high = high + 1;
           }
            else if(arr[mid] < target){
                low = mid + 1 ;
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }
}
