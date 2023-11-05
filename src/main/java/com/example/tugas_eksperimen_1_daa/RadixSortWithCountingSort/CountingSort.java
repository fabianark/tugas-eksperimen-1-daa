package com.example.tugas_eksperimen_1_daa.RadixSortWithCountingSort;

import java.util.Arrays;
import java.util.Collections;

public class CountingSort {
    public static int[] countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] countArr = new int[10]; // 10 possibilities for decimal digit (0-9)
        int[] outputArr = new int[n];

        // initialize count array with zeros
        for (int i = 0; i < 10; i++) {
            countArr[i] = 0;
        }

        // store count of each element
        for (int i = 0; i < n; i++) {
            countArr[(arr[i] / exp) % 10] += 1;
        }

        // store cumulative frequency
        for (int i = 1; i < 10; i++) {
            countArr[i] += countArr[i - 1];
        }

        // find the correct index of each element and put the element on that index in output array
        for (int i = n - 1; i >= 0; i--) {
            outputArr[countArr[(arr[i] / exp) % 10] - 1] = arr[i];
            countArr[(arr[i] / exp) % 10] -= 1; // subtract count for that value in count array
        }

        // put the sorted numbers in original array
        for (int i = 0; i < n; i++) {
            arr[i] = outputArr[i];
        }

        return arr;
    }
}
