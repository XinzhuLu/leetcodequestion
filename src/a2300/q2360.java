package a2300;

/**
 * @description: ???
 * Created by 馨竹 on 2023/03/31
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class q2360 {

    public static void main(String[] args) {

        //TODO 2360


        //TODO 2361



        //TODO 2362



        //TODO 2363



        //TODO 2364



        //TODO 2365



        //TODO 2366



        //TODO 2367
        /*
         * You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:*/

        int [] nums = {0,1,4,6,7,10};
        System.out.println(arithmeticTriplets(nums, 3));


        //TODO 2368



        //TODO 2369





    }

    public static int arithmeticTriplets(int[] nums, int diff) {

        int count = 0 ;

        int len = nums.length - 1;

        retry:
        for (int i = 0; i < len; i++) {

            int target = nums[i] + diff;

            for (int j = i+1; j < len; j++) {

                if (nums[j] == target){

                    target += diff;
                    for (int k = j+1 ; k < len+1; k++) {

                        if (target == nums[k]){
                            count++;
                            continue retry;
                        }
                    }
                }
            }
        }

        return count;
    }
}
