package LeetCodeProblems;

public class Leetcode1672 {
    public static void main(String[]args){
        int[][]accounts={{1,2,3},{3,2,1}};
        System.out.println(check(accounts));
    }
    static int check(int[][]accounts){
        int maz=0;
        int sum=0;
        for (int i = 0; i < accounts.length; i++) {

            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];

            }
            if (sum>maz){
                maz=sum;
            }
        }

        return maz;
    }
}
