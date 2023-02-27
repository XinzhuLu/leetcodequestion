package a0001;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

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
/*        You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

        You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(6 , node1);
        ListNode node3 = new ListNode(5 , node2);

        System.out.println( node3.val + "," +node3.next.val + "," +node3.next.next.val);

        System.out.println(listNodeToInt(node3));
        //TODO 03


        //TODO 04


        //TODO 05


        //TODO 06


        //TODO 07


        //TODO 08


        //TODO 09



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
