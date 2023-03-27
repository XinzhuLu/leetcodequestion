package a1000;

/**
 * @description: ???
 * Created by 馨竹 on 2023/04/03
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class q1050 {

    public static void main(String[] args) {

        //TODO 1050


        //TODO 1051


        //TODO 1052


        //TODO 1053
/*Given an array of positive integers arr (not necessarily distinct), return the lexicographically largest permutation that is smaller than arr, that can be made with exactly one swap. If it cannot be done, then return the same array.
Note that a swap exchanges the positions of two numbers arr[i] and arr[j]*/
        int[] arr = {3,1,2,1,3};
        arr=prevPermOpt1(arr);
        for (int i:arr
             ) {
            System.out.println(i);
        }
        //TODO 1054


        //TODO 1055


        //TODO 1056


        //TODO 1057


        //TODO 1058


        //TODO 1059



    }

    public static int[] prevPermOpt1(int[] arr) {

        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                int j = n - 1;
                while (arr[j] >= arr[i] || arr[j] == arr[j - 1]) {
                    j--;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
            }
        }
        return arr;
    }
}
