//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
package LeetCodeProblems;

public class Leetcode1281 {
    public static void main(String[]args){
        int num=234;
        System.out.println(subractprofromsum(num));
    }
    static int subractprofromsum(int num){
        int product = 1;
        int add = 0;
        while (num>0) {
            int lastdigit = num % 10;
            product = product * lastdigit;
            add = add + lastdigit;
            num=num/10;
        }
        return product-add;
    }
}
