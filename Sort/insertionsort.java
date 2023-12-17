package Sort;

public class insertionsort {
    public static void main(String args[]){

       // System.out.println("Hello");

        int a[] = {20,30,15,17,18};

        a = insertion(a);
        for(int i =0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static int[] insertion(int a[]){

        int n = a.length;
        for(int i = 1;i< n;i++){
            int temp = a[i];
            int j = i -1;
             while (j >=0 && a[j] > temp){
                a[j+1] = a[j];
                j= j - 1;

             }
             a[j+1] = temp ;
        }

        return a;
    }
    
}
