package com.charlottekies.algoutils.searching.divideandconquer;

import java.util.Arrays;

public class BinarySearcher extends Searcher {

    /**
     * <p>
     *     Implements a binary search algorithm to perform a case-sensitive search for a given target in an array of alphabetically-sorted Strings.
     * </p>
     * @param strs an array o strings to search
     * @param target the string to search for
     * @return the index of the first-found target if exists, otherwise, -1.
     */
    @Override
    public int search(String[] strs, String target) {
        return 0;
    }

    /**
     * <p>
     *     Implements a binary search algorithm to perform a search for a given target in an array of sorted ints.
     * </p>
     * @param nums an array of numbers to search
     * @param target the number to search for
     * @return the index of the first-found target if exists, otherwise, -1.
     */
    @Override
    public int search(int[] nums, int target) {
        Integer[] comparableArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        return binarySearch(comparableArr, target);
    }

    /**
     * <p>
     *     Implements a binary search algorithm to perform a search for a given target in an array of sorted Integers.
     * </p>
     * @param nums an array of Integers to search
     * @param target the Integer to search for
     * @return the index of the first-found target if exists, otherwise, -1.
     */
    @Override
    public int search(Integer[] nums, Integer target) {
        return 0;
    }

    private <T extends Comparable<T>> int binarySearch(T[] arr, T target) {
        return 0;
    }
}
