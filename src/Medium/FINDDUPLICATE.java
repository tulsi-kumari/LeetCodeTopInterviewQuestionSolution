package Medium;

public class FINDDUPLICATE {
    //Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
    //
    //There is only one repeated number in nums, return this repeated number.
    //
    //You must solve the problem without modifying the array nums and uses only constant extra space.




    //#1.
    //Think of model of linked list, and algorithm of cycle detection.
    //A common and practical one is Tortoise and Hare algorithm, also known as Floyd's algorithm.
    //
    //#2.
    //Convert this challenge into cycle detection in linked list, and locating of start node of cycle.
    //
    //Each array cell denotes a node in linked list.
    //And the value of each array cell points to the next node in linked list.
    //
    //Finally, what we want to know is the duplicate number, which also is the start node of cycle, and vice versa.
    //
    //We take the demo input as example, please refer to the diagram as following.
    //
    //#3.
    //
    //Remeber that description asks us not to modify the array.
    //(assume the array is read only).
    public int findDuplicate(int[] nums) {

        int s=0;
        int f=0;
        do{
            s=nums[s];
            f=nums[nums[f]];
        }while(f!=s);
        int finder =0;
        s=nums[s];
        finder=nums[finder];
        while(s!=finder){
            s=nums[s];
            finder=nums[finder];

        }
        return s;

    }
}
