/**
 * 描述
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where
 * index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not
 * zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 你可以按任意顺序返回答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum_001{
    /**
     * 分析
     * 1、暴力，复杂度O(n^2) 会超时
     * 2、利用map 的空间换时间策略目前使最优的办法
     */
    static class Solution {


        public int[] twoSum(int[] nums, int target) {

            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target-nums[i])){
                    return new int[]{map.get(target-nums[i]),i};
                }else{
                    map.put(nums[i],i);
                }

            }

            return null;
        }

}
    public static void main(String[] args) {
        int[] array = new Solution().twoSum(new int[]{2,7,11,15},9);
        System.out.println(array[0] + "," + array[1]);
    }

}
