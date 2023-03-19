package a0100;

/**
 * @description: ???
 * Created by 馨竹 on 2023/03/19
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class q0030 {

    public static void main(String[] args) {

        //TODO 30



        //TODO 31



        //TODO 32



        //TODO 33



        //TODO 34



        //TODO 35
/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
*/


        //TODO 36



        //TODO 37


        //TODO 38


        //TODO 30


    }


    public static int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};//控制空的边界情况
        }
            int n = nums.length, left = 0, right = n - 1, mid = left + ((right - left) >> 1);
            boolean find = false;//判断是否找到了相等数字
            while (left <= right) {
                mid = left + ((right - left) >> 1);//防止right+left超出Integer最大值 使用位运算增加效率
                if (nums[mid] > target) {
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    find = true;
                    break;//找到了推出
                }
            }
            if (!find) {
                return new int[]{-1, -1};
            }
            int l = mid, r = mid;
            while (l - 1 >= 0 && nums[l] == nums[l - 1]) {
                l--;//从中点向左展开}
                while (r + 1 <= n - 1 && nums[r] == nums[r + 1]) {
                    r++;//从中点向右展开}
                    return new int[]{l, r};
                }
            }
        return new int[]{-1, -1};
    }
}
