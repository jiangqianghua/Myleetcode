package com.jqh;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        try {
            int result[] = new Solution().twoSum(nums, target);
            System.out.println("计算结果：" + result[0] + " : " + result[1]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int result[] ;
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],i);
        }
        for(int i = 0 ; i < nums.length ; i++){
            int num = target - nums[i];
            if(map.containsKey(num) && map.get(num) != i){
                return new int[]{i, map.get(num)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int num = target - nums[i];
            if(map.containsKey(num) && map.get(num) != i){
                return new int[]{i, map.get(num)};
            } else {
                map.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
