package Easy;

public class PalinSentence {
    //A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
    // non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and
    // numbers.
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));

    }
    public static boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        int capA=(int)'A';
        int capZ=(int)'Z';
        int smA=(int)'a';
        int smZ=(int)'z';
        int i=0;
        int j=sb.length()-1;
        while(i<=j){

            while(i<=j&&!((sb.charAt(i)<=capZ&&sb.charAt(i)>=capA)||(sb.charAt(i)<=smZ&&sb.charAt(i)>=smA))){
                i++;
            }
            while(i<=j&&!((sb.charAt(j)<=capZ&&sb.charAt(j)>=capA)||(sb.charAt(j)<=smZ&&sb.charAt(j)>=smA))){
                j--;
            }
            if(i>j){
                return true;
            }
            if(((sb.charAt(i)<=capZ&&sb.charAt(i)>=capA)&&(sb.charAt(j)<=capZ&&sb.charAt(j)>=capA))||
                    ((sb.charAt(i)<=smZ&&sb.charAt(i)>=smA)&&(sb.charAt(j)<=smZ&&sb.charAt(j)>=smA))){
                if(sb.charAt(i)==sb.charAt(j)){
                    i++;
                    j--;

                }else{
                    return false;
                }
            }else if((sb.charAt(i)<=capZ&&sb.charAt(i)>=capA)){
                if((sb.charAt(i)-'A')==(sb.charAt(j)-'a')){
                    i++;
                    j--;

                }else{
                    return false;
                }
            }else{
                if((sb.charAt(j)-'A')==(sb.charAt(i)-'a')){
                    i++;
                    j--;

                }else{
                    return false;
                }
            }
        }
        return true;

    }
}
