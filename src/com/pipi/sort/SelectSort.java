package com.pipi.sort;

public class SelectSort {

    /**
     * 4 5 6 3 2 1
     * 1 5 6 3 2 4
     * 1 2 6 3 5 4
     * 1 2 3 6 5 4
     * 1 2 3 4 5 6
     * 1 2 3 4 5 6
     *
     * 选择排序
     *
     * 分为已排和未排区间，每次在未排区间中找到最小的，放到已排区间末尾
     *
     * @param data
     */
    public static void sort(int[] data) {

        for (int i = 0; i < data.length; i++) {

            int swapIndex = i;
            int min = data[i];

            for (int j = i; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    swapIndex = j;
                }
            }

            int tmp = data[swapIndex];
            data[swapIndex] = data[i];
            data[i] = tmp;
        }

    }

    public static void main(String[] args) {
        int[] data = new int[]{4, 5, 6, 3, 2, 1};
        sort(data);
        for (int val : data) {
            System.out.println(val);
        }
    }

}
