package Medium;
import java.util.*;
public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid =
                {
                        {'1','1','0','0','0'},
                        {'1','1','0','0','0'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}
                };
        System.out.println(numIslands(grid));

      }
    public static int numIslands(char[][] grid) {
        char[][] temp=new char[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' &&temp[i][j]!='1'){
                    count++;
                    bfs(i,j,grid,temp);
                }
            }
        }
        return count;
    }
    public static class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public static void bfs (int i,int j,char[][] grid,char[][] temp){
        Queue<Pair> q=new LinkedList<>();
        temp[i][j]='1';
        q.offer(new Pair(i,j));
        while(!q.isEmpty()){
            Pair t=q.poll();
            if(t.i>0){
                if(grid[t.i-1][t.j]=='1'&&temp[t.i-1][t.j]!='1'){
                    temp[t.i-1][t.j]='1';
                    q.offer(new Pair(t.i-1,t.j));
                }
            }
            if(t.j>0){
                if(grid[t.i][t.j-1]=='1'&&temp[t.i][t.j-1]!='1'){
                    temp[t.i][t.j-1]='1';
                    q.offer(new Pair(t.i,t.j-1));
                }
            }
            if(t.i<grid.length-1){
                if(grid[t.i+1][t.j]=='1'&&temp[t.i+1][t.j]!='1'){
                    temp[t.i+1][t.j]='1';
                    q.offer(new Pair(t.i+1,t.j));
                }
            }
            if(t.j<grid[0].length-1){
                if(grid[t.i][t.j+1]=='1'&&temp[t.i][t.j+1]!='1'){
                    temp[t.i][t.j+1]='1';
                    q.offer(new Pair(t.i,t.j+1));
                }
            }
        }
    }
}
