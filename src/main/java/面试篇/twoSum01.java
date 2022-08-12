package 面试篇;

/**
 * 两数之和
 */
public class twoSum01 {
    //暴力解法
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
        twoSum01 twoSum = new twoSum01();
        int[] sum = twoSum.sum(nums, target);
        for (int i : sum) {
            System.out.println(i);
        }
    }
}
