package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: ???
 * Created by 馨竹 on 2023/03/19
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class comp {

    public static void main(String[] args) {

        //int[] ans= evenOddBit(17);
        //System.out.println(ans[0] +"，"+ ans[1]);

        int[][] grid = {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};

        System.out.println(checkValidGrid(grid));
    }

    public static int[] evenOddBit(int n) {

        int even = 0;
        int odd = 0;

        int times = 0 ;
        while (n>=2){

            if (n%2==1){
                odd++;
            }
            n/=2;
            times++;
            if (n%2==1){
                even++;
            }
            n/=2;
            times++;
        }

        int[] ans = new int[2];
        if (times%2==0){

            if (n==1){
                odd++;
            }
            ans[0] = odd;
            ans[1] = even;

        }else {

            if (n==1){
                even++;
            }
            ans[0] = even;
            ans[1] = odd;
        }

        return ans;
    }


    public static boolean checkValidGrid(int[][] grid) {

        int sideLen = grid.length;

        Map<Integer , List<Integer>> map = new HashMap<>(sideLen*sideLen);

        for (int i = 0; i < sideLen; i++) {

            for (int j = 0; j < sideLen; j++) {

                Integer key = grid[i][j];
                List<Integer> value = new ArrayList<>();
                value.add(i);
                value.add(j);
                map.put(key , value);
            }
        }

        int mapSize = map.size();

        int standRow,standCol,tarRow,tarCol;

        for (int i = 0; i < mapSize-1; i++) {

            List<Integer> standPoint = map.get(i);
            List<Integer> targetPoint = map.get(i+1);

            standRow =standPoint.get(0);
            standCol =standPoint.get(1);
            tarRow =targetPoint.get(0);
            tarCol =targetPoint.get(1);

            if (!(((standRow + 1 == tarRow)||(standRow - 1 == tarRow))&&((standCol + 2 == tarCol)||(standCol - 2 == tarCol)))||(((standRow + 2 == tarRow)||(standRow - 2 == tarRow))&&((standCol + 1 == tarCol)||(standCol - 1 == tarCol)))){
                standRow = tarRow;
                standCol = tarCol;
                continue;
            }
            return false;
        }

        return true;
    }




}
