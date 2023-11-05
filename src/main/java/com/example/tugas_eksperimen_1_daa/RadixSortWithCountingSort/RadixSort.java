package com.example.tugas_eksperimen_1_daa.RadixSortWithCountingSort;

public class RadixSort {
    public static int[] radixSort(int[] arr) {
        int max = Util.max(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            CountingSort.countingSort(arr, exp);
        }
        return arr;
    }
}
