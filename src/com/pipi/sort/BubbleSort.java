package com.pipi.sort;

public class BubbleSort {

    /**
     * 4 5 6 3 2 1
     * 4 5 3 2 1 6
     * 4 3 2 1 5 6
     * 3 2 1 4 5 6
     * 2 1 3 4 5 6
     * 1 2 3 4 5 6
     *
     * 冒泡排序
     * 分成已排和未排两个区域，每次找出最大或者最小的放到已排的一边
     *
     * @param data
     */
    public static void sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
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
