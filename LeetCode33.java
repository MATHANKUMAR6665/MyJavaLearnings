package LeetCodeProblems;

public class LeetCode33 {
    public static void main(String[]arg){
        int[]nums={5,1,3};
        int target=5;
        System.out.println(search(nums,target));

    }
    static int search(int[]arr,int target){
        int Peak=peakElements(arr);
        int Ans=orderagnosticSearch(arr,target,0,Peak);
        if (Ans !=-1){
            return Ans;
        }else{
            return orderagnosticSearch(arr,target,Peak+1,arr.length-1);
        }
    }
    static int peakElements(int[]arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] > arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
    static int orderagnosticSearch(int[]arr,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            boolean isAsc=start<end;
            if (isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else{
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
