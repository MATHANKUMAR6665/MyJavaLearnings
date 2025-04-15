package LeetCodeProblems;

import java.util.Arrays;

public class LeetCode34 {
    public static void main(String[]args){
        int[]arr={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    static int[] searchRange(int[] nums, int target) {
        int []ans={-1,-1};
        int start=find(nums,target,true);
        int end=find(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
//which is used to find the starting  and end index of the target
    //basically we use the isAvailable boolean so that we can able to find the value is mathched
     static int find(int[]arr,int target,boolean isAvailable){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start +(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                ans=mid;
                if (isAvailable){//if it is true means i need to we need to reduce the end .search on the left side
                    end=mid-1;
                }else{
                    start=mid+1;  //we need to search on the  right side so we increase the start.
                }
            }
        }
        return ans;
    }
}
