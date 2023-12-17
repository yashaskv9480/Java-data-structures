package Problems;
import java.util.Scanner;


public class armstrong {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
			int rem =0 ,sum = 0;
			int n = sc.nextInt();
			int temp = n;
			while(n>0){
			    rem = n % 10;
			    sum = sum + (rem * rem * rem);
			    n = n/ 10;
			}
			if(sum == temp){
			    System.out.print("True");
			    
			}
			else{
			    System.out.print("False");
			}
		}

    }
    
}
