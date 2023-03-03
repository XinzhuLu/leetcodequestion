package a0001;

/**
 * @description: ???
 * Created by 馨竹 on 2023/03/02
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class q0010 {

    public static void main(String[] args) {

        //TODO 10
        /*Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
        '.' Matches any single character.​​​​
        '*' Matches zero or more of the preceding element.
        The matching should cover the entire input string (not partial).*/

        //TODO 11
        /*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
        Find two lines that together with the x-axis form a container, such that the container contains the most water.
        Return the maximum amount of water a container can store.*/

        //TODO 12
        /*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.*/
        //System.out.println(intToRoman(1994));
        //System.out.println(intToRoman(3));

        //TODO 13
        /*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.*/
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("MXCIV"));


        //TODO 14





        //TODO 15





        //TODO 16





        //TODO 17





        //TODO 18




        //TODO 19






    }

    public static int romanToInt(String s) {

        char[] romanList = s.toCharArray();
        int len = romanList.length;
        int sum = 0 ;

        for (int i = 0; i < len; i++) {

            if (romanList[i] == 'M'){
                sum += 1000;
                continue;
            }

            if (romanList[i] == 'D'){
                sum += 500;
                continue;
            }

            if (romanList[i] == 'C' && i+1<len && (romanList[i+1] == 'M' || romanList[i+1] == 'D')){
                sum -= 100;
                continue;
            }else if(romanList[i] == 'C'){
                sum += 100;
                continue;
            }

            if (romanList[i] == 'L'){
                sum += 50;
                continue;
            }

            if (romanList[i] == 'X' && i+1<len && (romanList[i+1] == 'C' || romanList[i+1] == 'L')){
                sum -= 10;
                continue;
            }else if (romanList[i] == 'X'){
                sum += 10;
                continue;
            }

            if (romanList[i] == 'V'){
                sum += 5;
                continue;
            }

            if (romanList[i] == 'I' && i+1<len && (romanList[i+1] == 'X' || romanList[i+1] == 'V')){
                sum -= 1;
                continue;
            }else if (romanList[i] == 'I'){
                sum += 1;
                continue;
            }

        }

        return sum;
    }

    public static String intToRoman(int num) {

        String[] romanList = new String[4];
        int listPoint = 0;

        int charTemp = 0;

        if (num>=1000){

            charTemp = num/1000;

            switch (charTemp){

                case 0 :
                    break;

                case 1 :
                    romanList[listPoint] = "M" ;
                    break;

                case 2 :
                    romanList[listPoint] = "MM" ;
                    break;

                case 3 :
                    romanList[listPoint] = "MMM" ;
                    break;

                case 4 :
                    romanList[listPoint] = "MMMM" ;
                    break;

                case 5 :
                    romanList[listPoint] = "MMMMM" ;
                    break;
            }

            listPoint++;

            num = num % 1000;

        }

        if (num >= 100){

            charTemp = num/100;

            switch (charTemp){

                case 0 :

                    break;

                case 1 :
                    romanList[listPoint] = "C" ;
                    break;

                case 2 :
                    romanList[listPoint] = "CC" ;
                    break;

                case 3 :
                    romanList[listPoint] = "CCC" ;
                    break;

                case 4 :
                    romanList[listPoint] = "CD" ;
                    break;

                case 5 :
                    romanList[listPoint] = "D" ;
                    break;

                case 6 :
                    romanList[listPoint] = "DC" ;
                    break;

                case 7 :
                    romanList[listPoint] = "DCC" ;
                    break;

                case 8 :
                    romanList[listPoint] = "DCCC" ;
                    break;

                case 9 :
                    romanList[listPoint] = "CM" ;
                    break;
            }

            listPoint++;

            num = num % 100;

        }

        if (num>=10){

            charTemp = num/10;

            switch (charTemp){

                case 0 :
                    romanList[listPoint] = "" ;
                    break;

                case 1 :
                    romanList[listPoint] = "X" ;
                    break;

                case 2 :
                    romanList[listPoint] = "XX" ;
                    break;

                case 3 :
                    romanList[listPoint] = "XXX" ;
                    break;

                case 4 :
                    romanList[listPoint] = "XL" ;
                    break;

                case 5 :
                    romanList[listPoint] = "L" ;
                    break;

                case 6 :
                    romanList[listPoint] = "LX" ;
                    break;

                case 7 :
                    romanList[listPoint] = "LXX" ;
                    break;

                case 8 :
                    romanList[listPoint] = "LXXX" ;
                    break;

                case 9 :
                    romanList[listPoint] = "XC" ;
                    break;
            }

            listPoint++;

            num = num % 10;

        }

        if (num>=1){

            charTemp = num;

            switch (charTemp){

                case 0 :
                    romanList[listPoint] = "" ;
                    break;

                case 1 :
                    romanList[listPoint] = "I" ;
                    break;

                case 2 :
                    romanList[listPoint] = "II" ;
                    break;

                case 3 :
                    romanList[listPoint] = "III" ;
                    break;

                case 4 :
                    romanList[listPoint] = "IV" ;
                    break;

                case 5 :
                    romanList[listPoint] = "V" ;
                    break;

                case 6 :
                    romanList[listPoint] = "VI" ;
                    break;

                case 7 :
                    romanList[listPoint] = "VII" ;
                    break;

                case 8 :
                    romanList[listPoint] = "VIII" ;
                    break;

                case 9 :
                    romanList[listPoint] = "IX" ;
                    break;

            }
        }

        String ans = new String();
        for (int i = 0; i < 4; i++) {
            if (romanList[i] != null){
                ans += romanList[i];
            }
        }
        return ans;
    }


    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            }
            else {
                --r;
            }
        }
        return ans;
    }


    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m + 1][n + 1];
        f[0][0] = true;
        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j - 1) == '*') {
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                } else {
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
        }
        return f[m][n];
    }

    public boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }

}
