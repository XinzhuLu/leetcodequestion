/**
 * @description: ???
 * Created by 馨竹 on 2023/02/27
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class q0000 {

    public static void main(String[] args) {

        int[] nums = {3,3};
        int target = 6;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0] + "," + ints[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        int len = nums.length;

        int num1,num2;

        for (int i = 0; i < len-1; i++) {
            for (int j = i+1 ; j < len; j++) {

                num1=nums[i];
                num2=nums[j];

                if(target == num1 + num2){

                    result[0]=i;
                    result[1]=j;

                    return result;

                }
            }
        }
        return result;
    }
}
