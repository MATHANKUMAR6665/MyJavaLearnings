package LeetCodeProblems;

import java.util.Scanner;

public class Leetcode374 {
    public static void main(String[]args){
        int n=10;
        int target=5;
        System.out.println (guessgame(n,target));
    }
    static int guessgame(int n,int target){
        Scanner sc=new Scanner(System.in);

        int start=0;
        int end=n;
        while (start<=n){
            System.out.println("please enter the guessing number");
            int guess=sc.nextInt();

            if (guess<target){
                end=n-1;
                System.out.println("guess high");
            }else if(guess>target){
                System.out.println("guess low");
                start=start+1;
            }else {
                System.out.println("target found");
                return guess;
            }


        }
        return -1;
    }
}
