package Easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr={8,9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        if(digits[n-1]<9){
            digits[n-1]+=1;
            return digits;
        }else{
            int count=1;
            if(n!=1){
            digits[n-1]=0;}
            for(int i=n-2;i>0;i--){
                if(digits[i]+count<9){
                    digits[i]+=count;
                    return digits;
                }else{
                    int m=digits[i]+count;
                    digits[i]=m%10;
                    count=m/10;
                }
            }
            if(digits[0]+count<=9){
                digits[0]+=count;
                return digits;
            }
            int m=digits[0]+count;
            digits[0]=m%10;
            count=m/10;
            if(count/10==0){
                int[] ans=new int[n+1];
                ans[0]=count;
                for(int i=n-1, j=ans.length-1;i>=0;i--,j--){
                    ans[j]=digits[i];
                }
                return ans;
            }else if(count/100==0){
                int[] ans=new int[n+2];
                ans[0]=count%10;
                ans[1]=count/10;
                for(int i=n, j=ans.length-1;i>=0;i--,j--){
                    ans[j]=digits[i];
                }
                return ans;
            }else{
                int[] ans=new int[n+3];
                ans[0]=count%10;
                ans[1]=(count%100)/10;
                ans[2]=count%100;
                for(int i=n, j=ans.length-1;i>=0;i--,j--){
                    ans[j]=digits[i];
                }
                return ans;
            }


        }
    }
}
