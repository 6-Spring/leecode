package 面试篇;

/**
 * @author 郑元龙
 * @description: 两数之和
 * @date 2022年08月12日 11:45
 */

public class TwoSum01 {

    /**
     * 暴力解法
     * @param nums
     * @param target
     * @return 返回新数组，0,1
     */
    public int[] sum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i +1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]){
                    return new int[]{i,j};
                }
            }
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
