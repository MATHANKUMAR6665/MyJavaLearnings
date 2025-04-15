package LeetCodeProblems;
/*in this scenario this will be a infinite arry so that we cant able to use the arr.length method so that we use different
methodology to predict the answer so try different method

            1.first we can apply binary search cus its a sorted array
            2.for binary search we need start and end in this case we know our start but we dont know our end
            first we need to find the start and end after we can apply the binary search.
            3. we are applying normal binary search here nothing new and just alter some lines of code
 */
public class AmazonQuesGeekforDGeek {
    public static void main(String[] args) {
        int[]arr={3,5,7,9,10,90,100,130,140,160,170,174,177,179};
        int target=171   ;
        System.out.println(startAndEnd(arr,target));
    }
    static int find(int[]arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int startAndEnd(int []arr,int target){
        int start=0;
        int end=1;
        while (target>arr[end]){
            int NewStart=end+1;
            end=end+(end-start+1)*2;
            start=NewStart;
        }
        return find(arr,target,start,end);
    }

}
