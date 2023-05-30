package Easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0;


        while( i<s.length() ){
            if(( ( s.charAt(i)>=(int)'a' ) && ( s.charAt(i) <= (int)'z') )||
                    (( s.charAt(i)>=(int)'A' ) && ( s.charAt(i) <= (int)'Z')) ||
                    (s.charAt(i)>='0' && s.charAt(i)<='9') ){
                sb.append(s.charAt(i));
            }

            i++;
        }

        String temp=sb.toString();
        temp=temp.toLowerCase();
        sb.setLength(0);
        sb.append(temp);
        String orig=sb.toString();
        String reverse=sb.reverse().toString();
        if(orig.equals(reverse)){
            return true;
        }
        return false;
    }
}
