package Medium;

import java.util.*;
public class Permutation {
    public static void main(String[] args) {

        int[] arr={1,2,3};
        System.out.println(permute(arr));
    }
    public static List<List<Integer>> permute(int[] nums) {

        List<Integer> temp=new ArrayList<>();
        return help(nums,0,temp);
    }
    public static List<List<Integer>> help(int[] nums,int i,List<Integer> temp){
        if(i==nums.length){
            List<List<Integer>> t=new ArrayList<>();
            t.add(new ArrayList<Integer>(temp));
            return t;
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int j=0;j<=i;j++){
            temp.add(j,nums[i]);
            ans.addAll(help(nums,i+1,temp));
            temp.remove(j);
        }
        return ans;
    }
}
