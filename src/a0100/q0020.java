package a0100;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @description: ???
 * Created by 馨竹 on 2023/03/21
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class q0020 {

    public static void main(String[] args) {

        //TODO 20
/*
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/

        //System.out.println(isValid("{[]}"));
        System.out.println(isValid("{["));


        //TODO 21


        //TODO 22


        //TODO 23


        //TODO 24


        //TODO 25


        //TODO 26


        //TODO 27


        //TODO 28


        //TODO 29





    }

    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();
        int len = chars.length;

        if (len == 0 || len%2==1){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < len; i++) {

            Character temp = chars[i];

            if (temp == '(' || temp == '[' || temp == '{' ){

                stack.push(temp);
                continue;

            }
            Character left;
            try {
                left = stack.pop();
            }catch (Exception e){
                return false;
            }

            if (temp == ')'){

                if (left != '(' ){
                    return false;
                }

            }

            if (temp == ']'){

                if (left != '[' ){
                    return false;
                }

            }

            if (temp == '}'){

                if (left != '{' ){
                    return false;
                }

            }

        }

        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
