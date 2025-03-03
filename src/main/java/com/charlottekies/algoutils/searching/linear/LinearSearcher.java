package com.charlottekies.algoutils.searching.linear;

import com.charlottekies.algoutils.searching.divideandconquer.Searcher;

import java.util.Arrays;

public class LinearSearcher extends Searcher {
    @Override
    public int search(String[] strs, String target) {
        return linearSearch(strs, target);
    }

    @Override
    public int search(int[] nums, int target) {
        Integer[] integerArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        return linearSearch(integerArray, target);
    }

    @Override
    public int search(Integer[] nums, Integer target) {
        return linearSearch(nums, target);
    }

    private <T extends Comparable<T>> int linearSearch(T[] arr, T target) {
        for (int i = 0; i <arr.length; i++) {
            if (arr[i].compareTo(target) == 0) {
                return i;
            }
        }
        return -1;
    }
}
