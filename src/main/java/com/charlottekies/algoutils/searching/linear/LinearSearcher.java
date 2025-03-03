package com.charlottekies.algoutils.searching.linear;

import com.charlottekies.algoutils.searching.Searcher;

import java.util.Arrays;

public class LinearSearcher extends Searcher {

    /**
     * <p>
     *     Implements a linear search algorithm to perform a case-sensitive search for a given target in an array of alphabetically-sorted Strings.
     * </p>
     * @param strs an array o strings to search
     * @param target the string to search for
     * @return the index of the first-found target if exists, otherwise, -1.
     */
    @Override
    public int search(String[] strs, String target) {
        return linearSearch(strs, target);
    }

    /**
     * <p>
     *     Implements a linear search algorithm to perform a search for a given target in an array of ints.
     * </p>
     * @param nums an array of int to search
     * @param target the int to search for
     * @return the index of the first-found target if exists, otherwise, -1.
     */
    @Override
    public int search(int[] nums, int target) {
        Integer[] integerArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        return linearSearch(integerArray, target);
    }

    /**
     * <p>
     *     Implements a linear search algorithm to perform a search for a given target in an array of Integers.
     * </p>
     * @param nums an array of Integers to search
     * @param target the Integer to search for
     * @return the index of the first-found target if exists, otherwise, -1.
     */
    @Override
    public int search(Integer[] nums, Integer target) {
        return linearSearch(nums, target);
    }

    /**
     * <p>
     *     Implements a linear search algorithm to perform a case-sensitive search for a given target in an array of alphabetically-sorted Strings.
     * </p>
     * @param strs an array of Strings to search
     * @param target the String to search for
     * @return true if exists, otherwise, false
     */
    @Override
    public boolean includes(String[] strs, String target) {
        return includes(strs, target);
    }

    /**
     * <p>
     *     Implements a linear search algorithm to perform a search for a given target in an array of ints.
     * </p>
     * @param nums an array of ints to search
     * @param target the int to search for
     * @return true if exists, otherwise, false
     */
    @Override
    public boolean includes(int[] nums, int target) {
        Integer[] integerNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        return linearIncludes(integerNums, target);
    }

    /**
     * <p>
     *     Implements a linear search algorithm to perform a search for a given target in an array of Integers.
     * </p>
     * @param nums an array of Integers to search
     * @param target the Integer to search for
     * @return true if exists, otherwise, false
     */
    @Override
    public boolean includes(Integer[] nums, Integer target) {
        return includes(nums, target);
    }

    private <T extends Comparable<T>> int linearSearch(T[] arr, T target) {
        for (int i = 0; i <arr.length; i++) {
            if (arr[i].compareTo(target) == 0) {
                return i;
            }
        }
        return -1;
    }

    private <T extends Comparable<T>> boolean linearIncludes(T[] arr, T target) {
        for (int i = 0; i <arr.length; i++) {
            if (arr[i].compareTo(target) == 0) {
                return true;
            }
        }
        return false;
    }
}
