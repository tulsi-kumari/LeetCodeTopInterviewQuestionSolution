package Easy;
import java.util.*;
public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {

        return help(0,0,n,"");
    }
    public static List<String> help(int i,int j,int n,String temp){
        if(i==n&&j==n){
            List<String> t=new ArrayList<>();
            t.add(new String(temp));
            return t;
        }
        List<String> ans=new ArrayList<>();
        if(i==n){
            ans.addAll(help(i,j+1,n,temp+')'));
        }else if(j<i){
            ans.addAll(help(i,j+1,n,temp+')'));
            ans.addAll(help(i+1,j,n,temp+'('));
        }else if(j==i){
            ans.addAll(help(i+1,j,n,temp+'('));
        }
        return ans;
    }
}
