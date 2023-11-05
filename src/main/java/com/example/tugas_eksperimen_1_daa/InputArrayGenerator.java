package com.example.tugas_eksperimen_1_daa;

import java.util.Random;

public class InputArrayGenerator {
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        // generate random int array in the range of: 0 to (size - 1)
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }

        return array;
    }

    public static int[] generateSortedArray(int size) {
        int[] array = new int[size];

        // generate sorted int array of: 0 to (size - 1)
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        return array;
    }

    public static int[] generateReversedArray(int size) {
        int[] array = new int[size];

        // generate reverse-sorted int array of: (size - 1) to 0
        for (int i = size - 1; i >= 0; i--) {
            array[(size - 1) - i] = i;
        }

        return array;
    }
}
