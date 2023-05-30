
import java.util.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t!=0){
            int n=in.nextInt();

            int[] arr1=new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=in.nextInt();
            }

            int[] arr2=new int[n];
            for(int i=0;i<n;i++){
                arr2[i]=in.nextInt();
            }

            int count=0;
            boolean flag=false;
            boolean mark=false;
            for(int i=0;i<n;i++){
                if(arr1[i]==1){
                    count++;
                }
                if(arr1[i]==0&&arr2[i]==1){
                    mark=true;
                }
                if(arr1[i]==1&&arr2[i]==0){
                    flag=true;
                }
            }
            if(flag||(mark&&count==0)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

            t--;
        }
    }
}