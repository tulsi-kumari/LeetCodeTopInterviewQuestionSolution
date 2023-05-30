package Hard;
import java.util.*;
public class NQueensII {
    public static void main(){
        System.out.println(totalNQueens(4));
    }
    public static boolean isSafe(int i,int j,HashSet<Integer> row,HashSet<Integer> col,HashSet<Integer> diag){
        if(row.contains(i)){
            return false;
        }
        if(col.contains(j)){
            return false;
        }
        if(diag.contains(Math.abs(i-j))){
            return false;
        }
        return true;
    }
    public  static  int totalNQueens(int n) {
        int[][] board=new int[n][n];
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();
        HashSet<Integer> diag=new HashSet<>();
        return help(0,n,row,col,diag,board,0);
    }
    public static int help(int i,int n,HashSet<Integer> row,HashSet<Integer> col,HashSet<Integer> diag,int[][] board,int ans ){

        if(i==n){
            return 1;
        }
        for(int k=0;k<n;k++){
            if(isSafe(i,k,row,col,diag)){
                board[i][k]=1;
                row.add(i);
                col.add(k);
                diag.add(Math.abs(i-k));
                ans+=help(i+1,n,row,col,diag,board,ans);
                board[i][k]=0;
                row.remove(i);
                col.remove(k);
                diag.remove(Math.abs(i-k));

            }
        }
        return ans;
    }
}
