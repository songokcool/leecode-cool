package com.fibonacci.april;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个整数数组nums和一个整数目标值target，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author fibonacci
 * @date 2021-04-28 22:14
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {17, 8, 1, 3, 12, 6, 9, 11, 21, 7, 19};
        int target = 8;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(target - nums[i]) != null) {
                result[0] = i;
                result[1] = hashMap.get(target - nums[i]);
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return result;
    }
}
