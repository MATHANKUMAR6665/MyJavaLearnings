//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
package LeetCodeProblems;
public class Leetcode1295 {
    public static void main(String[]args){
        int[]nums={12,345,2,6,7896};
        System.out.println(findnum(nums));
    }
    static int findnum(int[]nums){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            int num=nums[i];
            if (even(num)){
                count++;
            }

        }
        return count;
    }
    static int digit(int num){
        int count=0;//intitially count value shoud be zero
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    static boolean even(int num){
        int noofdigit=digit(num);
        return noofdigit%2==0;
    }
}
