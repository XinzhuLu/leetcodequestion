package a1500;

import common.Solution;

/**
 * @description: ???
 * Created by 馨竹 on 2023/03/25
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class q1570 {

    public static void main(String[] args) {

        //TODO 1570



        //TODO 1571



        //TODO 1572



        //TODO 1573



        //TODO 1574
/*Given an integer array arr, remove a subarray (can be empty) from arr such that the remaining elements in arr are non-decreasing.Return the length of the shortest subarray to remove.A subarray is a contiguous subsequence of the array.*/


        //TODO 1575



        //TODO 1576



        //TODO 1577



        //TODO 1578



        //TODO 1579




    }
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length, j = n - 1;
        while (j > 0 && arr[j - 1] <= arr[j]) {
            j--;
        }
        if (j == 0) {
            return 0;
        }
        int res = j;
        for (int i = 0; i < n; i++) {
            while (j < n && arr[j] < arr[i]) {
                j++;
            }
            res = Math.min(res, j - i - 1);
            if (i + 1 < n && arr[i] > arr[i + 1]) {
                break;
            }
        }
        return res;
    }

}
