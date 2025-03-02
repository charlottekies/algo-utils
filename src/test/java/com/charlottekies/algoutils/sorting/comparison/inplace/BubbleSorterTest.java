package com.charlottekies.algoutils.sorting.comparison.inplace;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSorterTest {

    private BubbleSorter bubbleSorter;

    @BeforeEach
    void setUp() {
        bubbleSorter = new BubbleSorter();
    }


    @Test
    void sortInts() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, bubbleSorter.sort(new int[]{3, 2, 1, 5, 4}));
        assertArrayEquals(new int[]{}, bubbleSorter.sort(new int[]{}));
        assertArrayEquals(new int[]{-3,-2,-1}, bubbleSorter.sort(new int[]{-3,-2,-1}));
        assertArrayEquals(new int[]{-3,-2,-1}, bubbleSorter.sort(new int[]{-1,-2,-3}));
        assertArrayEquals(new int[]{-1,-1,-1}, bubbleSorter.sort(new int[]{-1,-1,-1}));
        assertArrayEquals(new int[]{0}, bubbleSorter.sort(new int[]{0}));
    }

    @Test
    void sortStrings() {
        assertArrayEquals(new String[]{"cat", "dog", "elephant"}, bubbleSorter.sort(new String[]{"elephant", "cat", "dog"}));
        assertArrayEquals(new String[]{"1", "dog", "elephant"}, bubbleSorter.sort(new String[]{"elephant", "1", "dog"}));
        assertArrayEquals(new String[]{"1", "dog", "elep1hant", "elephant"}, bubbleSorter.sort(new String[]{"elephant", "elep1hant", "1", "dog"}));
        assertArrayEquals(new String[]{"1", "2", "3", "4"}, bubbleSorter.sort(new String[]{"2", "3", "1", "4"}));
        assertArrayEquals(new String[]{"DOG", "Dog", "dog", "Elephant"}, bubbleSorter.sort(new String[]{"Elephant", "dog", "Dog", "DOG"}));
    }
}