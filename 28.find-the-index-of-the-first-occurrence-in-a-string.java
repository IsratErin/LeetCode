/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
         String input1 =  haystack;
        String input2 =  needle;

        if(input1.contains(input2)){
            return input1.indexOf(input2);
        }else{
            return -1;
        }
        
    }
}
//@lc code=end

