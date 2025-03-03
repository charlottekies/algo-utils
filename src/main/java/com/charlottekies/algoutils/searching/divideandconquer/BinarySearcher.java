package com.charlottekies.algoutils.searching.divideandconquer;

import com.charlottekies.algoutils.searching.Searcher;
import com.charlottekies.algoutils.sorting.comparison.inplace.BubbleSorter;

import java.util.Arrays;

public class BinarySearcher extends Searcher {
    private BubbleSorter bubbleSorter;

    public BinarySearcher(BubbleSorter bubbleSorter) {
        this.bubbleSorter = bubbleSorter;
    }

    /**
     * <p>
     *     Implements a binary search algorithm to perform a case-sensitive search for a given target in an array of alphabetically-sorted (not ascii-sorted) Strings.
     * </p>
     * <p>
     * <p>
     *     Example: cat &lt Elephant
     *     Example: CAT &lt Cat &lt cat
     * </p>
     *
     * @param strs  an array o strings to search
     * @param target the string to search for
     * @return the index of the first-found target if exists, otherwise, -1.
     */
    @Override
    public int search(String[] strs, String target) {
        return binaryStringSearch(strs, target);
    }

    /**
     * <p>
     *      Implements a binary search algorithm to perform a search for a given target in an array of sorted ints.
     * </p>
     *
     * @param nums   an array of numbers to search
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
     *      Implements a binary search algorithm to perform a search for a given target in an array of sorted Integers.
     * </p>
     *
     * @param nums   an array of Integers to search
     * @param target the Integer to search for
     * @return the index of the first-found target if exists, otherwise, -1.
     */
    @Override
    public int search(Integer[] nums, Integer target) {
        return binarySearch(nums, target);
    }

    /**
     * <p>
     *      Alphabetically sorts and then implements a binary search algorithm to perform a case-sensitive search for a given target in an array unsorted Strings.
     *      Assumes alphabetical sorting ranks capital letters higher than lowercase
     * </p>
     * <p>
     *      Example: CAT &lt Cat &lt cat
     *      Example: cat &lt Elephant
     * </p>
     *
     * @param strs   an array of Strings to search
     * @param target the String to search for
     * @return true if exists, otherwise, false
     */
    @Override
    public boolean includes(String[] strs, String target) {
        strs = bubbleSorter.sort(strs);
        return binaryIncludes(strs, target);
    }

    /**
     * <p>
     *      Sorts and then implements a binary search algorithm to perform a search for a given target in an unsorted array of ints.
     * </p>
     * <p>
     *      Example: (nums: {1, 4, -5, 1}, target: -5) =&gt true
     * </p>
     *
     * @param nums   an array of ints to search
     * @param target the int to search for
     * @return true if exists, otherwise, false
     */
    @Override
    public boolean includes(int[] nums, int target) {
        nums = bubbleSorter.sort(nums);
        Integer[] integerNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        return binaryIncludes(integerNums, target);
    }

    /**
     * <p>
     *      Sorts and then implements a binary search algorithm to perform a search for a given target in an unsorted array of Integers.
     * </p>
     * <p>
     *      Example: (nums: {1, 4, -5, 1}, target: -5) =&gt true
     * </p>
     *
     * @param nums   an array of Integers to search
     * @param target the Integer to search for
     * @return true if exists, otherwise, false
     */
    @Override
    public boolean includes(Integer[] nums, Integer target) {
        nums = bubbleSorter.sort(nums);
        return binaryIncludes(nums, target);
    }

    private <T extends Comparable<T>> int binarySearch(T[] arr, T target) {
        int lowerSearchIndex = 0;
        int higherSearchIndex = arr.length - 1;

        while (lowerSearchIndex <= higherSearchIndex) {
            int midpointIndex = (lowerSearchIndex + higherSearchIndex) / 2; // index = 3, = 6

            if (arr[midpointIndex].compareTo(target) == 0) {
                return midpointIndex;
            }
            else if (arr[midpointIndex].compareTo(target) < 0) {
                lowerSearchIndex = midpointIndex + 1;
            } else {
                higherSearchIndex = midpointIndex - 1;
            }
        }
        return -1;
    }

    private int binaryStringSearch(String[] arr, String target) {
        int lowerSearchIndex = 0;
        int higherSearchIndex = arr.length - 1;

        while (lowerSearchIndex <= higherSearchIndex) {
            int midpointIndex = (lowerSearchIndex + higherSearchIndex) / 2; // index = 3, = 6

            if (arr[midpointIndex].compareTo(target) == 0) {
                return midpointIndex;
            }
            else if (arr[midpointIndex].compareToIgnoreCase(target) == 0) {
                if (arr[midpointIndex].compareTo(target) < 0) {
                    lowerSearchIndex = midpointIndex + 1;
                } else {
                    lowerSearchIndex = midpointIndex + 1;
                }
            } else if (arr[midpointIndex].compareToIgnoreCase(target) < 0) {
                lowerSearchIndex = midpointIndex + 1;
            } else {
                higherSearchIndex = midpointIndex - 1;
            }
        }
        return -1;
    }

    private <T extends Comparable<T>> boolean binaryIncludes(T[] arr, T target) {
        int lowerBound = 0;
        int upperBound = arr.length - 1;

        while (lowerBound <= upperBound) {
            int midpoint = (lowerBound + upperBound) / 2;

            if (arr[midpoint].compareTo(target) == 0) {
                return true;
            } else if (arr[midpoint].compareTo(target) < 0) {
                lowerBound = midpoint + 1;
            } else {
                upperBound = midpoint - 1;
            }
        }
        return false;
    }

}
