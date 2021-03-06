package com.jzoffer.array;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * * From  xxwy
 *
 */
public class Solution {


    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int [] array) {
        OptionalInt min = Arrays.stream(array).min();
        return min.getAsInt();
    }



    /**
     * 二维数组的查找
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
     * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * @param target
     * @param array
     * @return
     */
    public  boolean Find(int target, int[][] array) {
        int lnum = array.length;
        int hnum = array[0].length;
        //从左下或者右上开始
        int i = lnum - 1;
        int j = 0;
        while (i >= 0 && j < hnum) {
            if (target < array[i][j]) {
                i--;
            }
            else if (target > array[i][j]) {
                j++;
            }
            else {
                return true;
            }
        }
        return false;
    }




    public static void main(String[] args) {
        int[][] array = {{1, 2, 8, 9,10}, {2, 4, 9, 12,16}, {4, 7, 10, 16,18}, {6, 8, 11, 15,19}};
        //boolean find = Solution.Find(7, array);
    }


}
