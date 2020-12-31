package com.pipi.search;

public class BinarySearch {

    public static int[] data = new int[]{1, 2, 3, 4, 5, 6, 8, 8, 8, 11, 18};

    /**
     * 递归二分法
     *
     * @param args
     */
    public static void main(String[] args) {
//        System.out.println("递归二分法：" + recursionBinarySearch(data, 8, 0, data.length - 1));
//
//        System.out.println("循环二分法：" + loopBinarySearch(data, 8));
//
//        System.out.println("给定值第一次出现的位置：" + firstMathBinarySearch(data, 8));
//
//        System.out.println("给定值最后一次出现的位置：" + lastMathBinarySearch(data, 8));
//
//        System.out.println("第一个比给定值大的值出现的位置：" + firstBiggerThanMathBinarySearch(data, 8));
//
//        System.out.println("最后一个比给定值小的值出现的位置：" + firstLessThanMathBinarySearch(data, 8));

        int[] circleArray = new int[]{4, 5, 6, 7, 0, 1, 2};

        System.out.println("循环数组二分法：" + circleBinarySearch(circleArray, 1));

    }

    public static int recursionBinarySearch(int[] data, int key, int low, int high) {
        if (low >= high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (data[mid] == key) {
            return mid;
        } else if (data[mid] > key) {
            return recursionBinarySearch(data, key, low, mid - 1);
        } else {
            return recursionBinarySearch(data, key, mid + 1, high);
        }
    }

    public static int loopBinarySearch(int[] data, int value) {

        int low = 0, high = data.length;

        while (low <= high) {

            int mid = (high + low) / 2;

            if (data[mid] == value) {
                return mid;
            } else if (data[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return -1;
    }

    public static int firstMathBinarySearch(int[] data, int value) {

        int low = 0, high = data.length;

        while (low <= high) {

            int mid = (high + low) / 2;

            if (data[mid] > value) {
                high = mid - 1;
            } else if (data[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || data[mid - 1] != value) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }

        }

        return -1;
    }

    public static int lastMathBinarySearch(int[] data, int value) {

        int low = 0, high = data.length;

        while (low <= high) {

            int mid = (high + low) / 2;

            if (data[mid] > value) {
                high = mid - 1;
            } else if (data[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == data.length - 1 || data[mid + 1] != value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }

        }

        return -1;
    }

    public static int firstBiggerThanMathBinarySearch(int[] data, int value) {

        int low = 0, high = data.length;

        while (low <= high) {

            int mid = (high + low) / 2;

            if (data[mid] > value) {
                high = mid - 1;
            } else if (data[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == data.length - 1) {
                    return -1;
                }
                if (data[mid + 1] != value) {
                    return mid + 1;
                } else {
                    low = mid + 1;
                }
            }

        }

        return -1;
    }


    public static int firstLessThanMathBinarySearch(int[] data, int value) {

        int low = 0, high = data.length;

        while (low <= high) {

            int mid = (high + low) / 2;

            if (data[mid] > value) {
                high = mid - 1;
            } else if (data[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0) {
                    return -1;
                }
                if (data[mid - 1] != value) {
                    return mid - 1;
                } else {
                    high = mid - 1;
                }
            }

        }

        return -1;
    }

    public static int circleBinarySearch(int[] data, int target) {

        int low = 0, high = data.length - 1;

        while (low <= high) {

            int mid = (high + low) / 2;

            if (data[mid] == target) {
                return mid;
            }

            // 不含折点的一侧，一定是单调递增的
            if (data[mid] < data[low]) {
                // 折点在左边

                if (data[low] >= data[mid] && data[mid] >= target) {

                } else {

                }


            } else {
                // 折点在右边

            }

        }

        return -1;
    }


}
