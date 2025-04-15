//https://leetcode.com/problems/two-sum/
package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode1 {
    public static void main(String[] args) {
        int []arr={2,7,11,15};
        int target=18;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    static int[] twoSum(int[] nums, int target) {
        int []ans={-1,-1};
        for(int i=0;i<nums.length;i++){
            for(int j=i++;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
}