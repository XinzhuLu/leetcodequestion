package a1600;

import common.Solution;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @description: ???
 * Created by 馨竹 on 2023/03/27
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class q1630 {
    public static void main(String[] args) {
        //TODO 1630


        //TODO 1631


        //TODO 1632


        //TODO 1633


        //TODO 1634


        //TODO 1635


        //TODO 1636


        //TODO 1637

        int [][]  points = {{8,7},{9,9},{7,4},{9,7}};
        int x = maxWidthOfVerticalArea(points);
        System.out.println(x);

        //TODO 1638


        //TODO 1639



    }


    public static int maxWidthOfVerticalArea(int[][] points) {

        int max = 0 ;
        int temp = 0 ;
        int len = points.length;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < len ; i++) {

            set.add(points[i][0]);
        }

        Integer[] array = set.stream().sorted().toArray(Integer[]::new);

        for (int i = 0; i < array.length-1; i++) {

            temp = array[i+1] - array[i];
            max = max >= temp ? max : temp;

        }

        return max;
    }


    public int countSubstrings(String s, String t) {
        int m = s.length(), n = t.length();
        int[][] dpl = new int[m + 1][n + 1];
        int[][] dpr = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dpl[i + 1][j + 1] = s.charAt(i) == t.charAt(j) ? (dpl[i][j] + 1) : 0;
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                dpr[i][j] = s.charAt(i) == t.charAt(j) ? (dpr[i + 1][j + 1] + 1) : 0;
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) != t.charAt(j)) {
                    ans += (dpl[i][j] + 1) * (dpr[i + 1][j + 1] + 1);
                }
            }
        }
        return ans;
    }

}
