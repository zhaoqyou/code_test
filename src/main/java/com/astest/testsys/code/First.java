package com.astest.testsys.code;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhaoning01
 * Date: 2020/5/6
 * Description: xxxx
 */
public class First {

    /**
     *2数之和
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标
     * */
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        // 外层循环遍历第一个数，内层循环从剩余数中找出与第一个数和为 target 的数

        for(int i = 0; i < nums.length - 1; i++){
            System.out.println("i值循环"+nums[i]);
            for(int j = i + 1; j < nums.length; j++){
                System.out.println("j值循环"+nums[j]);
                // 如果找到符合条件的两个数，则标记下标返回
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    System.out.println("ans值"+ans);
                    return ans;
                }
            }
        }
        return ans;
    }

    public int[] twoSums(int[] nums, int target) {
        // 创建 HashMap 辅助查找是否出现过符合条件的数。
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            System.out.println("i值循环"+nums[i]);
            // 从数组第一个数开始遍历，初始化可以与遍历到数相加得到 target 的数值。
            int curr = target - nums[i];
            // 如果符合条件的数之前遍历过，则直接返回。
            if(map.containsKey(curr)){
                System.out.println("curr值循环"+new int[]{map.get(curr), i});

                return new int[]{map.get(curr), i};
            }
            // 没有符合条件的数出现过，则将当前数和下标存入 HashMap
            map.put(nums[i], i);
            System.out.println("nums[i]值循环"+nums[i]);
        }
        throw new IllegalArgumentException("No solution!");
    }

}