package 面试篇.查找;

import java.util.Scanner;

/**
 * @author 郑元龙
 * @description: 二分查找
 * @date 2022年09月05日 20:25
 */

public class BinarySearch {
    public static void main(String[] args) {
        //定义一个排好序的数组
        int[] array = {1, 4, 5, 67, 78, 98, 123, 457, 4567};
        //定义目标数  int target = 123;
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        //调用二分查找
        int binary = binarySearch(array, target);
        System.out.println(binary);
    }

    public static int binarySearch(int[] a, int t){
        //定义左边界下标，右边界下标       ， 中间值下标
        int left = 0, right = a.length - 1, middle;
        //当左边小于等于右边，开始循环
        while(left <= right){
            //给中间下标赋值
            middle =  (left+right) / 2;
            //中间值等于目标数，直接返回
            if (a[middle] == t){
                return middle;
            }else if (a[middle] < t){
                //中间值小于目标t，则右边都小于t，左边界定义为中间值+1
                left = middle + 1;
            }else {
                //中间值大于目标t，则右边都大于t，右边界定义为中间值+1
                right = middle -1;
            }
        }
        //否则返回-1失败，没找到
        return -1;
    }
}
