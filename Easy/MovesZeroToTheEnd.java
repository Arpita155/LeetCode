package LeetCode.Easy;

import java.util.Arrays;

public class MovesZeroToTheEnd {

    public static void moveZeroes(int[] nums) {
        if(nums.length==0){
            return;
        }

        int k = 0;
        for(int i : nums){
            if(i != 0){
                nums[k++]=i;
            }
        }

        while(k < nums.length){
            nums[k++]=0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int []arr = {1,0,3,0,4,5};
        moveZeroes(arr);        // [1, 3, 4, 5, 0, 0]
    }
}
