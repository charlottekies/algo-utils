package com.charlottekies.algoutils.sorting.comparison.inplace;

import com.charlottekies.algoutils.sorting.Sorter;

import java.text.Collator;
import java.util.*;

public class BubbleSorter extends Sorter {
    /**
     * @param arr an array of ints
     * @return an array of ints sorted smallest to largest.
     */
    @Override
    public int[] sort(int[] arr) {
        Integer[] comparableArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Integer[] sortedIntegers = bubbleSort(comparableArr);
        return Arrays.stream(sortedIntegers).mapToInt(Integer::intValue).toArray();
    }

    /**
     * @param arr an array of strings
     * @return an array of strings sorted a to z, with numbers sorted before letters.
     */
    @Override
    public String[] sort(String[] arr) {
        return bubbleSortStrings(arr);
    }

    /**
     * @param arr an array of Integers
     * @return an array of Integers sorted smallest to largest.
     */
    @Override
    public Integer[] sort(Integer[] arr) {
        return bubbleSort(arr);
    }

    private <T extends Comparable<T>> T[] bubbleSort(T[] arr) {
        int lengthToCheck = arr.length - 1;
        while (lengthToCheck > 0) {
            boolean swapsMade = false;
            for (int j = 0; j < lengthToCheck; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    arr = swap(arr, j, j + 1);
                    swapsMade = true;
                }
            }
            lengthToCheck--;
            if (!swapsMade) {
                lengthToCheck = 0; // or simply break. Improves best case scenario.
            }
        }
        return arr;
    }

    private String[] bubbleSortStrings(String[] arr) {
        int lengthToCheck = arr.length - 1;
        while (lengthToCheck > 0) {
            boolean swapsMade = false;
            for (int j = 0; j < lengthToCheck; j++) {
                String str1 = arr[j];
                String str2 = arr[j + 1];
                if (str1.compareToIgnoreCase(str2) == 0) {
                    if (str1.compareTo(str2) > 0) {
                        arr = swap(arr, j, j + 1);
                        swapsMade = true;
                    }
                } else if (str1.compareToIgnoreCase(str2) > 0) {
                    arr = swap(arr, j, j + 1);
                    swapsMade = true;
                }
            }
            lengthToCheck--;
            if (!swapsMade) {
                lengthToCheck = 0; // or simply break. Improves best case scenario.
            }
        }
        return arr;
    }
}



