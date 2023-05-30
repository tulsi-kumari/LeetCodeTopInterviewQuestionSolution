package Medium;
import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] nums1={1,2};
                int[] nums2={-1,-2};
                        int[] nums3={-1,2};

                                int[] nums4={0,2};
        System.out.println(fourSumCount(nums1,nums2,nums3,nums4));
    }
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                mp.put(nums1[i]+nums2[j],mp.getOrDefault(nums1[i]+nums2[j],0)+1);
            }
        }

        int ans=0;
        for(int k=0;k<nums3.length;k++){
            for(int l=0;l<nums4.length;l++){
                ans+=mp.getOrDefault(-(nums3[k]+nums4[l]),0);
            }

        }
        return ans;
    }

}
