package com.pipi.sort;

public class MergeSort {

    /**
     * 分治
     * 将数据划分为几个部分进行排序合并
     *
     * @param data
     * @param start
     * @param end
     */
    public static void mergeSort(int[] data, int start, int end) {

        if (start >= end) {
            return;
        }

        // 将本次治理的数组划分成两部分
        int mid = (end + start) / 2;

        // 左边排序
        mergeSort(data, start, mid);
        // 右边排序
        mergeSort(data, mid + 1, end);

        // 双指针合并
        int i = start;
        int j = mid + 1;
        int k = 0;

        int[] tmp = new int[end - start + 1];

        // 对比两个部分的数据进行排序
        while (i <= mid && j <= end) {
            if (data[i] < data[j]) {
                tmp[k++] = data[i++];
            } else {
                tmp[k++] = data[j++];
            }
        }

        // 取出左边未比较数据
        while (i <= mid) {
            tmp[k++] = data[i++];
        }

        // 取出右边未比较数据
        while (j <= end) {
            tmp[k++] = data[j++];
        }

        // 将原未排序数据替换成排序数据
        for (int r = 0; r < tmp.length; r++) {
            data[start + r] = tmp[r];
        }

    }

    public static void main(String[] args) {
        int[] data = new int[]{4, 5, 6, 3, 2, 1};
        mergeSort(data, 0, data.length - 1);
        for (int val : data) {
            System.out.println(val);
        }
    }

}
