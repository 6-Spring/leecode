package 面试篇.排序;

/**
 * @author 郑元龙
 * @description: 冒泡排序
 * @date 2022年09月05日 21:25
 */

public class BubbleSort {
    public static void main(String[] args) {
        //定义数组
        int[] array = {1,23,3,44,15,33,66,22,90,88};
        //调用冒泡排序
        bubble(array);
        //循环遍历
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //冒泡算法
    public static void bubble(int[] arry) {
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length - i - 1; j++) {
                if (arry[j] > arry[j + 1]) {
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                }
            }
        }
    }

}
