//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
package LeetCodeProblems;
public class LeetCode744 {
    public static void main(String[] args) {
        char []letters={'c','f','j'};
        char target='a';
        System.out.println(find(letters,target));
    }
    static char find(char[]letters,char targret){
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (targret<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
