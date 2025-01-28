/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] my_array, int my_target) {
        int[] my_new_sol= new int[2];

        for (int i = 0; i < my_array.length; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if (my_array[j] == my_target - my_array[i]) {

                    my_new_sol[0]= i;
                    my_new_sol[1]= j;
                     return my_new_sol; 
                }
            }
        }
       return my_new_sol;
    }
}
// @lc code=end

