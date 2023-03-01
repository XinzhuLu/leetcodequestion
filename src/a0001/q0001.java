package a0001;

import java.util.*;

/**
 * @description: ???
 * Created by 馨竹 on 2023/02/27
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class q0001 {

    public static void main(String[] args) {

        //TODO 01
        /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.*/
        //int[] nums = {3,3};
        //int target = 6;
        //int[] ints = twoSum(nums, target);
        //System.out.println(ints[0] + "," + ints[1]);

        //TODO 02
        /*
        You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
        You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/
        //ListNode node1 = new ListNode(4);
        //ListNode node2 = new ListNode(6 , node1);
        //ListNode node3 = new ListNode(5 , node2);
        //System.out.println( node3.val + "," +node3.next.val + "," +node3.next.next.val);
        //System.out.println(listNodeToInt(node3));

        //TODO 03
/*Given a string s, find the length of the longest substring without repeating characters.*/
        //String s = "abcabcbb";
        //System.out.println(lengthOfLongestSubstring(s));

        //TODO 04
        /*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
        The overall run time complexity should be O(log (m+n))*/
        //int[] nums1 = {1,3};
        //int[] nums2 = {2,4};
        //System.out.println(findMedianSortedArrays(nums1, nums2));

        //TODO 05
        /*
        Given a string s, return the longest palindromic substring in s.
        */
        //String s = "babaa";
        //System.out.println(longestPalindrome(s));

        //TODO 06
        /*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
        */
        //String s = "PAYPALISHIRING";
        //char[][] charMap = stringToCharMap(s, 4);
        //String s1 = charMapToString(charMap, 4);
        //System.out.println(s1);

        //TODO 07
        /*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
        * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).*/

        System.out.println(reverse(123));

        //TODO 08


        //TODO 09



    }

    public static int reverse(int x) {

        int sum = 0 ;

        List<Integer> list = new LinkedList<>();

        if(x>=0){
            list.add(1);
        }else {
            list.add(-1);
        }
        while (x>9){
            list.add(x%10);
            x/=10;
        }
        list.add(x);

        int len = list.size();

        //if (len>11){
        //    return 0;
        //}

        try {
            for (int i = 1; i < len; i++) {
                sum = sum * 10 + list.get(i);
            }
            if (list.get(0) == -1){
                sum = -sum;
            }
            return sum;
        }catch (Exception e){

        }finally {
            return 0;
        }
    }


    public static String convert(String s, int numRows) {

        char[] chars = s.toCharArray();

        int len = chars.length;

        char[][] charMap = new char[numRows][len];



        return null;
    }

    public static char[][] stringToCharMap(String s, int numRows){

        char[] chars = s.toCharArray();

        int len = chars.length;

        char[][] charMap = new char[numRows][len];

        int rowPoint = 0;
        int volPoint = 0;
        int numRowsD1 = numRows - 1;
        int numRowsMod = numRows * 2 - 2;

        for (int i = 0; i < len; i++) {
            int temp = i % numRowsMod;
            if(temp < numRows){
                charMap[rowPoint][volPoint] = chars[i];
                rowPoint++;
                if (rowPoint == numRows) {
                    rowPoint = 0;
                    volPoint++;
                }
            }else {
                rowPoint = numRowsMod - temp;
                charMap[rowPoint][volPoint] = chars[i];
                rowPoint = 0;
                volPoint++;
            }

        }

        return charMap;
    }

    public static String charMapToString(char[][] charMap , int numRows){

        int rowLen = charMap.length;
        int volLen = charMap[0].length;

        int point = 0 ;

        char[] charsTemp = new char[volLen];

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < volLen; j++) {
                char c = charMap[i][j];
                if (c != '\0'){
                    charsTemp[point] = c;
                    point++;
                }
            }
        }

        //System.out.println(charsTemp);

        String s = String.valueOf(charsTemp);
        return s;
    }


    public static String longestPalindrome(String s) {

        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len1 = nums1.length;
        int len2 = nums2.length;

        int p1 = 0;
        int p2 = 0;

        int lenlen = len1 + len2;

        int len3 = lenlen / 2 + 1;
        int[] nums3 = new int[len3];
        int p3 = 0;

        for (p3 =0 ; p3<len3 ; p3++){

            if(p1 > len1){
                nums3[p3] = nums2[p2];
                p2++;
            }else if(p2 > len2){
                nums3[p3] = nums1[p1];
                p1++;
            }else if(nums1[p1]<nums2[p2]){
                nums3[p3] = nums1[p1];
                p1++;
                System.out.println(nums3[p3]);
            }else {
                nums3[p3] = nums2[p2];
                p2++;
                System.out.println(nums3[p3]);
            }
        }

        double ans;
        if (lenlen % 2 == 0){
            ans = (double)(nums3[len3-1]+nums3[len3-2]) / 2;
        }else {
            ans = nums3[len3-1];
        }
        return ans;
    }

    public static int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(4 , node1);
        ListNode node3 = new ListNode(4 , node2);

        return null;
    }

    public static int listNodeToInt(ListNode l1){

        int num = l1.val;

        if(l1.next != null){
            l1 = l1.next;
            num = num * 10 + l1.val;

        }

        return num * 10 + l1.next.val;
    }

    public static ListNode intToListNode(int num){

        ListNode head = new ListNode(num % 10);
        return null;

    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }

}
