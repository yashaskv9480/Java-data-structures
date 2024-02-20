package Patterns;

public class pattern5 {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            System.out.println("");
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
        }
        for(int i =4;i>=1;i--){
            System.out.println("");
            for (int j=i;j>=1;j--){
                System.out.print("* ");
            }
        }
    }
}
