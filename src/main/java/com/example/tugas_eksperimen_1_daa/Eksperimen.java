package com.example.tugas_eksperimen_1_daa;

import com.example.tugas_eksperimen_1_daa.PeekSort.PeekSort;
import com.example.tugas_eksperimen_1_daa.RadixSortWithCountingSort.RadixSort;

import java.util.Map;

public class Eksperimen {
    private static final int SMALL = 1000;
    private static final int MEDIUM = 10000;
    private static final int BIG = 100000;
    public static void main(String[] args) {
        // generate arrays for input dataset
        Map<String, int[]> arrays = Map.ofEntries(
            Map.entry("Random Small", InputArrayGenerator.generateRandomArray(SMALL)),
            Map.entry("Random Medium", InputArrayGenerator.generateRandomArray(MEDIUM)),
            Map.entry("Random Big", InputArrayGenerator.generateRandomArray(BIG)),
            Map.entry("Sorted Small", InputArrayGenerator.generateSortedArray(SMALL)),
            Map.entry("Sorted Medium", InputArrayGenerator.generateSortedArray(MEDIUM)),
            Map.entry("Sorted Big", InputArrayGenerator.generateSortedArray(BIG)),
            Map.entry("Reversed Small", InputArrayGenerator.generateReversedArray(SMALL)),
            Map.entry("Reversed Medium", InputArrayGenerator.generateReversedArray(MEDIUM)),
            Map.entry("Reversed Big", InputArrayGenerator.generateReversedArray(BIG))
        );

        System.out.println("RADIX SORT WITH COUNTING SORT");
        System.out.println();
        arrays.forEach((name,array) -> {
            long start1 = System.nanoTime();
            int[] inputArr = array;
            RadixSort.radixSort(inputArr);
            long end1 = System.nanoTime();

            System.out.println(name + " Array");
            System.out.println("Execution time: " + (end1 - start1) + " ns (nanoseconds)");
            System.out.println("-----------------------------------------------");
        });

        System.out.println();
        System.out.println("PEEKSORT");
        System.out.println();
        arrays.forEach((name,array) -> {
            long start2 = System.nanoTime();
            int[] inputArr = array;
            PeekSort.peeksort(inputArr, 0, inputArr.length - 1);
            long end2 = System.nanoTime();

            System.out.println(name + " Array");
            System.out.println("Execution time: " + (end2 - start2) + " ns (nanoseconds)");
            System.out.println("-----------------------------------------------");
        });
    }
}
