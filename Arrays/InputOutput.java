package Arrays;

import java.util.Scanner;

public class InputOutput {
    public static void main(String args[]){
        int[] a = new int[7];
        try (Scanner sc = new Scanner(System.in)) {
			for(int i=0;i< a.length;i++){
			    a[i] = sc.nextInt();
			}
		}
        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);

    }
}


}
