package com.charlottekies.algoutils.sorting.comparison.inplace;

import com.charlottekies.algoutils.sorting.Sorter;

import java.text.Collator;
import java.util.*;

public class BubbleSorter extends Sorter {
    @Override
    public int[] sort(int[] arr) {
        Integer[] comparableArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Integer[] sortedIntegers = bubbleSort(comparableArr);
        return Arrays.stream(sortedIntegers).mapToInt(Integer::intValue).toArray();
    }

    @Override
    public String[] sort(String[] arr) {
        return bubbleSort(arr);
    }

    private <T extends Comparable<T>> T[] bubbleSort(T[] arr) {
        // {3, 2, 1, 5, 4} : j = 0. 3 > 2 so swap
        // {2, 3, 1, 5, 4} : j = 1. 3 > 1 so swap
        // {2, 1, 3, 5, 4} : j = 2. 3 < 5 so don't swap
        // {2, 1, 3, 5, 4} : j = 3. 5 > 3 so swap
        // j == lengthToCheck, so decrement lengthToCheck and end the inner loop
        // the condition for the while loop is still true, so go back into the inner loop again
        // {2, 1, 3, 4, 5} : j = 0.
        int lengthToCheck = arr.length-1;
        while (lengthToCheck > 0) {
            boolean swapsMade = false;
            for (int j = 0; j < lengthToCheck; j++) {
                if (arr[j] instanceof String && arr[j + 1] instanceof String) {
                    String str1 = (String) arr[j];
                    String str2 = (String) arr[j + 1];
                    if (str1.compareToIgnoreCase(str2) == 0) {
                        if (str1.compareTo(str2) > 0) {
                            arr = swap(arr, j, j + 1);
                            swapsMade = true;
                        }
                    } else if (str1.compareToIgnoreCase(str2) > 0) {
                        arr = swap(arr, j, j + 1);
                        swapsMade = true;
                    }
                } else {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    arr = swap(arr, j, j+1);
                    swapsMade = true;
                }}
            }
            lengthToCheck--;
            if (!swapsMade) {
                lengthToCheck = 0; // or simply break. Improves best case scenario.
            }
        }
        return arr;
    }
}



