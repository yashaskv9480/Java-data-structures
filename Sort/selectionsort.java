//Select the largest element and put it at correct index
    //So we select max element put it at current index
    

package Sort;

public class selectionsort {
    
    public static void main(String args[]){
        int[] a = {5,12,45,32,12};
        int n = a.length;
        int max,temp,j;
        for(int i=0;i<n-1;i++){
            max = 0;
            for(j = 1;j<n-i;j++){
                if(a[j] > a[max]){
                    max =j;
                }
            }
            temp = a[n-1-i];
            a[n-1-i] = a[max];
            a[max] = temp;
        }
        for(int i =0;i<=n-1;i++){
              System.out.println(a[i]);

        }
      
    }
    
}