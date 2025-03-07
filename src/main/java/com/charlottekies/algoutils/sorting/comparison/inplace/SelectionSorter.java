package com.charlottekies.algoutils.sorting.comparison.inplace;

import com.charlottekies.algoutils.sorting.Sorter;

import java.util.Arrays;

public class SelectionSorter extends Sorter {
    /**
     * @param arr an array of ints
     * @return an array of ints sorted smallest to largest.
     */
    @Override
    public int[] sort(int[] arr) {
        Integer[] integerArray = Arrays.stream(arr)
                .boxed()
                .toArray(Integer[]::new);
        Integer[] sorted = selectionSort(integerArray);
        int[] result = Arrays.stream(sorted)
                .mapToInt(Integer::intValue)
                .toArray();
        return result;
    }

    /**
     * @param arr an array of strings
     * @return an array of strings sorted a to z, with numbers sorted before letters.
     */
    @Override
    public String[] sort(String[] arr) {
        return selectionSortStrings(arr);
    }

    /**
     * @param arr an array of Integers
     * @return an array of Integers sorted smallest to largest.
     */
    @Override
    public Integer[] sort(Integer[] arr) {
        return selectionSort(arr);
    }

    private <T extends Comparable<T>> T[] selectionSort(T[] array) {
        for (int i = 0; i <= array.length - 2; i++) {
            int indexOfSmallerT = i;
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[j].compareTo(array[indexOfSmallerT]) < 0) {
                    indexOfSmallerT = j;
                }
            }
            array = swap(array, i, indexOfSmallerT);
        }
        return array;
    }

    private String[] selectionSortStrings(String[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int indexOfSmallerT = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                String str1 = arr[j];
                String str2 = arr[indexOfSmallerT];
                if (str1.compareToIgnoreCase(str2) == 0) {
                    if (str1.compareTo(str2) < 0) {
                        indexOfSmallerT = j;
                    }
                } else if (str1.compareToIgnoreCase(str2) < 0) {
                    indexOfSmallerT = j;
                }
            }
            arr = swap(arr, i, indexOfSmallerT);
        }
        return arr;
    }
}
