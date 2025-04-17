package LeetCodeProblems;

public class LeetCode1095 {
    public static void main(String[] args) {
        //first we need to find the peek elements from the array
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int Target=3;
        System.out.println(search(arr,Target));
    }
    static int search(int[]arr,int target){
        int Peak=peakELements(arr);
        int Ans=orderAgnosticsearch(arr,target,0,Peak);
        if (Ans !=-1){
            return Ans;
        }
        return orderAgnosticsearch(arr,target,Peak+1,arr.length-1);
    }
    static int peakELements(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return end;
    }
    static int orderAgnosticsearch(int[]arr,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            boolean isAsc=start<end;
            if (target==arr[mid]){
                return mid;
            }
            if (isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if (target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}