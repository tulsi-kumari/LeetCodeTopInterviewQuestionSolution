package Easy;
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(10));
    }
    public static List<String> fizzBuzz(int n) {
        List<String> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%5==0&&i%3==0){
                ans.add("FizzBuzz");
            }else if(i%5==0){
                ans.add("Buzz");
            }else if(i%3==0){
                ans.add("Fizz");
            }else{
                String s=String.valueOf(i);
                ans.add(s);
            }
        }
        return ans;

    }
    public static int len(int n){
        int ans=1;
        while(n/10!=0){
            n=n/10;
            ans*=10;
        }
        return ans;
    }
}
