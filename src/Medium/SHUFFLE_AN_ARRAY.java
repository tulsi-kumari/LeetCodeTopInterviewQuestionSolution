package Medium;
import java.util.*;
public class SHUFFLE_AN_ARRAY {
    public static void main(String[] args) {
        int[] nums={};
        int [] arr;
        int [] org;
        arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        org=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            org[i]=nums[i];
        }
    }
    public static int[] reset(int[] org) {
        return org;
    }

    public int[] shuffle(int[] arr) {
        Random r=new Random();

        for(int i=arr.length-1;i>=0;i--){
            int j=r.nextInt(i+1);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }
}
