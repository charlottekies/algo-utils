package com.charlottekies.algoutils.sorting;

public abstract class Sorter implements Sort {

    protected static <T extends Comparable<T>> T[] swap(T[] array, int indexOfLargerT, int indexOfSmallerT) {
        T smaller = array[indexOfSmallerT];
        T larger = array[indexOfLargerT];
        array[indexOfSmallerT] = larger;
        array[indexOfLargerT] = smaller;
        return array;
    }
}
