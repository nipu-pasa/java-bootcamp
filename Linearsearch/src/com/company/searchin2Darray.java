package com.company;

import java.util.Arrays;

public class searchin2Darray {
    public static void main(String[] args) {
        int[][] arr= {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 39, 34, 56},
                {18, 12}
        };
        int target=56;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                {
                    return new int[]{row,col};
                }
            }

        }

        return new int[]{-1,-1};
    }
}
