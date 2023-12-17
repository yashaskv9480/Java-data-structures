package Strings;

public class palindrone {
    public static String isPalindrome(String s) {
        String temp = s.replaceAll("[:, ]","");
        String temp2 = temp.toLowerCase();
        System.err.println(temp2);
        StringBuilder builder = new StringBuilder(temp2);
        builder.reverse();
        
        if (temp2.equals(builder.toString())) {
            return "True";
        }
        
        return builder.toString(); 
    }
    public static void main(String args[]){
        String result = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
    }
}
