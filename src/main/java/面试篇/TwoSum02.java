package 面试篇;

import java.util.HashMap;

/**
 * @author 郑元龙
 * @description: 两数之和，优解
 * @date 2022年08月12日 11:47
 */

public class TwoSum02 {
    public int[] sum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //map中是否包含这个key
            if (map.containsKey( target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            //分别放入数组的值，和下标
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        TwoSum01 twoSum = new TwoSum01();
        int[] sum = twoSum.sum(nums, target);
        for (int i : sum) {
            System.out.println(i);
        }
    }
}
