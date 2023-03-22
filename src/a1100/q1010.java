package a1100;

import common.Solution;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


/**
 * @description: ???
 * Created by 馨竹 on 2023/03/20
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class q1010 {

    public static void main(String[] args) {


        //Todo 1010
        //Todo 1011
        //Todo 1012
        /*Given an integer n, return the number of positive integers in the range [1, n] that have at least one repeated digit.*/

        //System.out.println(numDupDigitsAtMostN(100000000));

        Solution solution = new Solution();
        System.out.println(solution.numDupDigitsAtMostN(1000));

        //Todo 1013
        //Todo 1014
        //Todo 1015
        //Todo 1016
        //Todo 1017
        //Todo 1018
        //Todo 1019
    }

    public static int numDupDigitsAtMostN(int n) {

        int ans = 0;

        if (n<11){
            return 0;
        }

        for (int i = 11; i <= n; i++) {


            int temp = 0 , listLen=0 , setLen=0;
            List<Integer> list = new ArrayList<>();
            Set<Integer> set = new LinkedHashSet<>();

            temp = i;

            while (temp>9){

                list.add(temp%10);
                set.add(temp%10);
                temp/=10;
            }
            list.add(temp);
            set.add(temp);

            listLen=list.size();
            setLen=set.size();

            if (listLen>setLen){
                ans++;
            }
        }
        return ans;
    }
}
