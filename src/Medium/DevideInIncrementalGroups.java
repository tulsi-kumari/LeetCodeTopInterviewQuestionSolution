package Medium;

public class DevideInIncrementalGroups {
    public static void main(String[] args) {
        System.out.println(countWaystoDivide(8,4));
    }
    public static int countWaystoDivide(int n, int k) {
        // Code here
        int[][] t=new int[n+1][k+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<k+1;j++){
                t[i][j]=-1;
            }
        }
        return help(n,k,1,t);
    }
    public static int help(int n,int k,int i,int[][] t){
        if(i>n){
            return 0;
        }
        if(k==1&&n!=0){
            return 1;
        }

        if(k==0&&n==0){
            return 1;
        }
        if(k==0||n==0){
            return 0;
        }

        if(i<=n){
            return help(n-i,k-1,i,t)+help(n,k,i+1,t);
        }else{
            return t[n][k]=help(n,k,i+1,t);
        }
    }
}
