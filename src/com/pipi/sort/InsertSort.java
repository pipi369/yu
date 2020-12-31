package com.pipi.sort;

public class InsertSort {


    /**
     * 4 5 6 1 2 3
     * 4 5 6 1 2 3
     * 4 5 6 1 2 3
     * 1 4 5 6 2 3
     * 1 2 4 5 6 3
     * 1 2 3 4 5 6
     *
     * 插入排序
     * 将数组分为已排和未排区间，取一个未排区间元素，在已排区间上找到合适的位置插入
     *
     * @param data
     */
    public static void sort(int[] data) {
        for (int i = 1; i < data.length; i++) {

            int val = data[i];

            int j = i - 1;

            for (; j >= 0; j--) {
                if (data[j] > val) {
                    data[j + 1] = data[j];
                } else {
                    break;
                }
            }

            data[j + 1] = val;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{4, 5, 6, 1, 2, 3};
        sort(data);
        for (int val : data) {
            System.out.println(val);
        }
    }

}
