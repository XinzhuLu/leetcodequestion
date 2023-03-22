package a2300;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @description: ???
 * Created by 馨竹 on 2023/03/26
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class q2390 {
    public static void main(String[] args) {
        //TODO 2390



        //TODO 2391



        //TODO 2392



        //TODO 2393



        //TODO 2394



        //TODO 2395
/*        Given a 0-indexed integer array nums, determine whether there exist two subarrays of length 2 with equal sum. Note that the two subarrays must begin at different indices.
        Return true if these subarrays exist, and false otherwise.
                A subarray is a contiguous non-empty sequence of elements within an array.*/



        //TODO 2396



        //TODO 2397



        //TODO 2398



        //TODO 2399





    }


    public boolean findSubarrays(int[] nums) {

        int len = nums.length;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < len-1; i++) {

            Integer temp = nums[i] + nums[i+1];

            if (!set.add(temp)){
                return true;
            }
        }
        return false;
    }
}
