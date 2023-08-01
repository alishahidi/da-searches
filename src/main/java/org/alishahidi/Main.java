package org.alishahidi;

import org.alishahidi.search.BinarySearch;
import org.alishahidi.search.InterpolationSearch;
import org.alishahidi.search.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 11, 14, 17, 22, 33};

        System.out.printf(String.valueOf(LinearSearch.search(array, 22)));
        System.out.printf(String.valueOf(BinarySearch.search(array, 22)));
        System.out.printf(String.valueOf(InterpolationSearch.search(array, 22)));
    }
}