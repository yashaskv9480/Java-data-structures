package Problems;

public class hcfandlcm {
    public static void main(String[] args) {
        int a = 4,b = 8;
        int result = calculatehcf(a,b);
        System.out.println("GCD/HCF : "+result);     
        int lcm = (a * b) / result;             //lcm = (a*b)/hcf(a,b)
        System.out.println("LCM:"+lcm);
    }
    public static int calculatehcf(int a, int b){

        if(a==0){
            return b;
        }
        return calculatehcf(b%a,a);
    }
}
