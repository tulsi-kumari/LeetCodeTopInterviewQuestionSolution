package Easy;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int maj=nums[0];
        int count =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==maj){
                count++;
            }else{
                count--;
            }
            if(count==0){
                maj=nums[i];
                count=1;
            }
        }
        count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==maj){
                count++;
            }
        }
        if(count>Math.floor(nums.length/2)){
            return maj;
        }
        return -1;
    }
}
