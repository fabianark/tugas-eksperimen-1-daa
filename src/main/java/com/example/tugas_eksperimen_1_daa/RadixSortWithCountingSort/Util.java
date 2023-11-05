package com.example.tugas_eksperimen_1_daa.RadixSortWithCountingSort;

public class Util {
    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
