package org.alishahidi.search;

public class BinarySearch {
    public static int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int value = array[middle];
            if (target > value) {
                left = middle + 1;
            } else if (target < value) {
                right = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

}
