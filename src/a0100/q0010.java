package a0100;

import java.util.*;

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
        //System.out.println(romanToInt("MCMXCIV"));
        //System.out.println(romanToInt("MXCIV"));


        //TODO 14
        /*Write a function to find the longest common prefix string amongst an array of strings.If there is no common prefix, return an empty string "".*/
        //String[] strs = {"flower", "flow", "flight"};
        //String[] strs = {"ab", "a", "a"};
        //String[] strs = {"fl", "fl", "fl"};
        //System.out.println(longestCommonPrefix(strs));


        //TODO 15
        /*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets.*/
        //int[] nums = {0, 0, 0, 0, 0, 0};
        //System.out.println(threeSum(nums).toString());


        //TODO 16
        /*
        * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.Return the sum of the three integers.You may assume that each input would have exactly one solution.*/
        //System.out.println(letterCombinations(""));

        System.out.println(letterCombinations("23"));

        //TODO 17
        /*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.*/

        //TODO 18
        /*Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
        0 <= a, b, c, d < n
        a, b, c, and d are distinct.
        nums[a] + nums[b] + nums[c] + nums[d] == target
        You may return the answer in any order.*/

        //TODO 19


    }

    public boolean isValid(String s) {

        char[] chars = s.toCharArray();

        return true;
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 4) {
            return quadruplets;
        }
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if ((long) nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
                continue;
            }
            for (int j = i + 1; j < length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }
                if ((long) nums[i] + nums[j] + nums[length - 2] + nums[length - 1] < target) {
                    continue;
                }
                int left = j + 1, right = length - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return quadruplets;
    }

    public static Character[] toCharacterArray( String s ) { if ( s == null ) { return null; } int len = s.length(); Character[] array = new Character[len]; for (int i = 0; i < len ; i++) { array[i] = new Character(s.charAt(i)); } return array; }

    public static List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        Map<Integer , List<String>> dMap = new HashMap<>();
        dMap.put( 2 , Arrays.asList("a" , "b" , "c"));
        dMap.put( 3 , Arrays.asList("d" , "e" , "f"));
        dMap.put( 4 , Arrays.asList("g" , "h" , "i"));
        dMap.put( 5 , Arrays.asList("j" , "k" , "l"));
        dMap.put( 6 , Arrays.asList("m" , "n" , "o"));
        dMap.put( 7 , Arrays.asList("p" , "q" , "r", "s"));
        dMap.put( 8 , Arrays.asList("t" , "u" , "v"));
        dMap.put( 9 , Arrays.asList("w" , "x" , "y" , "z"));

        String[] characters = digits.split("");

        int len = characters.length;

        if (len <= 0){
            ans.add("");
            return ans;
        }else if (len == 1){

            Integer key = Integer.valueOf(characters[0]);
            ans = dMap.get(key);
            return ans;
        }else {

            Integer key = Integer.valueOf(characters[0]);
            ans = dMap.get(key);


            for (int i = 1; i < len; i++) {

                Integer newKey = Integer.valueOf(characters[i]);
                List<String> newList = dMap.get(newKey);

                ans = dikaerList(ans , newList);

            }

            return ans;

        }
    }

    private static List<String> dikaerList( List<String> oldList ,  List<String> newList){

        int oldLen = oldList.size();
        int newLen = newList.size();
        List<String> dikaerList = new ArrayList<>();

        for (int oldPoint = 0; oldPoint < oldLen; oldPoint++) {
            for (int newPoint = 0; newPoint < newLen; newPoint++) {

                dikaerList.add(oldList.get(oldPoint) + newList.get(newPoint));
            }
        }

        return dikaerList;
    }

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;
        int best = 10000000;

        // 枚举 a
        for (int i = 0; i < n; ++i) {
            // 保证和上一次枚举的元素不相等
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // 使用双指针枚举 b 和 c
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                // 如果和为 target 直接返回答案
                if (sum == target) {
                    return target;
                }
                // 根据差值的绝对值来更新答案
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum > target) {
                    // 如果和大于 target，移动 c 对应的指针
                    int k0 = k - 1;
                    // 移动到下一个不相等的元素
                    while (j < k0 && nums[k0] == nums[k]) {
                        --k0;
                    }
                    k = k0;
                } else {
                    // 如果和小于 target，移动 b 对应的指针
                    int j0 = j + 1;
                    // 移动到下一个不相等的元素
                    while (j0 < k && nums[j0] == nums[j]) {
                        ++j0;
                    }
                    j = j0;
                }
            }
        }
        return best;
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 枚举 a
        for (int first = 0; first < n; ++first) {
            // 需要和上一次枚举的数不相同
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            // c 对应的指针初始指向数组的最右端
            int third = n - 1;
            int target = -nums[first];
            // 枚举 b
            for (int second = first + 1; second < n; ++second) {
                // 需要和上一次枚举的数不相同
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                // 需要保证 b 的指针在 c 的指针的左侧
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                // 如果指针重合，随着 b 后续的增加
                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }

    public static String longestCommonPrefix(String[] strs) {

        int rowLen = strs.length;
        char[][] charsMap = new char[rowLen][200];


        int rowPoint;
        int volLimit = strs[0].length();

        String ans = "";

        for (int i = 0; i < rowLen; i++) {
            charsMap[i] = strs[i].toCharArray();
        }

        for (int volPoint = 0; volPoint < volLimit; volPoint++) {


            try {
                for (rowPoint = 1; rowPoint < rowLen; rowPoint++) {
                    if (charsMap[0][volPoint] != charsMap[rowPoint][volPoint]) {
                        return ans;
                    }
                }
            } catch (Exception e) {
                return ans;
            }

            ans += charsMap[0][volPoint];

        }

        return ans;
    }

    public static int romanToInt(String s) {

        char[] romanList = s.toCharArray();
        int len = romanList.length;
        int sum = 0;

        for (int i = 0; i < len; i++) {

            if (romanList[i] == 'M') {
                sum += 1000;
                continue;
            }

            if (romanList[i] == 'D') {
                sum += 500;
                continue;
            }

            if (romanList[i] == 'C' && i + 1 < len && (romanList[i + 1] == 'M' || romanList[i + 1] == 'D')) {
                sum -= 100;
                continue;
            } else if (romanList[i] == 'C') {
                sum += 100;
                continue;
            }

            if (romanList[i] == 'L') {
                sum += 50;
                continue;
            }

            if (romanList[i] == 'X' && i + 1 < len && (romanList[i + 1] == 'C' || romanList[i + 1] == 'L')) {
                sum -= 10;
                continue;
            } else if (romanList[i] == 'X') {
                sum += 10;
                continue;
            }

            if (romanList[i] == 'V') {
                sum += 5;
                continue;
            }

            if (romanList[i] == 'I' && i + 1 < len && (romanList[i + 1] == 'X' || romanList[i + 1] == 'V')) {
                sum -= 1;
                continue;
            } else if (romanList[i] == 'I') {
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

        if (num >= 1000) {

            charTemp = num / 1000;

            switch (charTemp) {

                case 0:
                    break;

                case 1:
                    romanList[listPoint] = "M";
                    break;

                case 2:
                    romanList[listPoint] = "MM";
                    break;

                case 3:
                    romanList[listPoint] = "MMM";
                    break;

                case 4:
                    romanList[listPoint] = "MMMM";
                    break;

                case 5:
                    romanList[listPoint] = "MMMMM";
                    break;
            }

            listPoint++;

            num = num % 1000;

        }

        if (num >= 100) {

            charTemp = num / 100;

            switch (charTemp) {

                case 0:

                    break;

                case 1:
                    romanList[listPoint] = "C";
                    break;

                case 2:
                    romanList[listPoint] = "CC";
                    break;

                case 3:
                    romanList[listPoint] = "CCC";
                    break;

                case 4:
                    romanList[listPoint] = "CD";
                    break;

                case 5:
                    romanList[listPoint] = "D";
                    break;

                case 6:
                    romanList[listPoint] = "DC";
                    break;

                case 7:
                    romanList[listPoint] = "DCC";
                    break;

                case 8:
                    romanList[listPoint] = "DCCC";
                    break;

                case 9:
                    romanList[listPoint] = "CM";
                    break;
            }

            listPoint++;

            num = num % 100;

        }

        if (num >= 10) {

            charTemp = num / 10;

            switch (charTemp) {

                case 0:
                    romanList[listPoint] = "";
                    break;

                case 1:
                    romanList[listPoint] = "X";
                    break;

                case 2:
                    romanList[listPoint] = "XX";
                    break;

                case 3:
                    romanList[listPoint] = "XXX";
                    break;

                case 4:
                    romanList[listPoint] = "XL";
                    break;

                case 5:
                    romanList[listPoint] = "L";
                    break;

                case 6:
                    romanList[listPoint] = "LX";
                    break;

                case 7:
                    romanList[listPoint] = "LXX";
                    break;

                case 8:
                    romanList[listPoint] = "LXXX";
                    break;

                case 9:
                    romanList[listPoint] = "XC";
                    break;
            }

            listPoint++;

            num = num % 10;

        }

        if (num >= 1) {

            charTemp = num;

            switch (charTemp) {

                case 0:
                    romanList[listPoint] = "";
                    break;

                case 1:
                    romanList[listPoint] = "I";
                    break;

                case 2:
                    romanList[listPoint] = "II";
                    break;

                case 3:
                    romanList[listPoint] = "III";
                    break;

                case 4:
                    romanList[listPoint] = "IV";
                    break;

                case 5:
                    romanList[listPoint] = "V";
                    break;

                case 6:
                    romanList[listPoint] = "VI";
                    break;

                case 7:
                    romanList[listPoint] = "VII";
                    break;

                case 8:
                    romanList[listPoint] = "VIII";
                    break;

                case 9:
                    romanList[listPoint] = "IX";
                    break;

            }
        }

        String ans = new String();
        for (int i = 0; i < 4; i++) {
            if (romanList[i] != null) {
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
            } else {
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
