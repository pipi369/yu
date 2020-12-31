package com.pipi.sort;

public class QuickSort {

    public static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public static void sort(int[] data, int start, int end) {

        // 哨兵
        if (start >= end) {
            return;
        }

        // 以最后节点作为基准值
        int mid = data[end];

        // 左右指针，左指针不能大于右指针
        int left = start, right = end - 1;

        while (left < right) {

            // 找到左边比基准值大的
            while (data[left] <= mid && left < right) {
                left++;
            }

            // 找到右边比基准值小的
            while (data[right] >= mid && left < right) {
                right--;
            }

            // 交换大小两个值
            swap(data, left, right);
        }

        if (data[left] > data[end]) {
            swap(data, left, end);
        } else {
            left++;
        }

        // 排小的一边
        sort(data, start, left - 1);

        // 排大的一边
        sort(data, left + 1, end);

    }

    public static void main(String[] args) {
        int[] data = new int[]{8, 6, 9, 3, 2};
        sort(data, 0, data.length - 1);
        for (int val : data) {
            System.out.println(val);
        }
    }

}
