package com.charlottekies.algoutils.sorting.comparison.inplace;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSorterTest {

    private SelectionSorter selectionSorter;

    @BeforeEach
    void setUp() {
        selectionSorter = new SelectionSorter();
    }

    @Test
    void sortInts() {
        assertArrayEquals(new int[]{1, 2, 3}, selectionSorter.sort(new int[]{3, 2, 1}));
        assertArrayEquals(new int[]{}, selectionSorter.sort(new int[]{}));
        assertArrayEquals(new int[]{-3,-2,-1}, selectionSorter.sort(new int[]{-3,-2,-1}));
        assertArrayEquals(new int[]{-3,-2,-1}, selectionSorter.sort(new int[]{-1,-2,-3}));
        assertArrayEquals(new int[]{-1,-1,-1}, selectionSorter.sort(new int[]{-1,-1,-1}));
        assertArrayEquals(new int[]{0}, selectionSorter.sort(new int[]{0}));
    }

    @Test
    void sortStrings() {
        assertArrayEquals(new String[]{"cat", "dog", "elephant"}, selectionSorter.sort(new String[]{"elephant", "cat", "dog"}));
        assertArrayEquals(new String[]{"1", "dog", "elephant"}, selectionSorter.sort(new String[]{"elephant", "1", "dog"}));
        assertArrayEquals(new String[]{"1", "dog", "elep1hant", "elephant"}, selectionSorter.sort(new String[]{"elephant", "elep1hant", "1", "dog"}));
        assertArrayEquals(new String[]{"1", "2", "3", "4"}, selectionSorter.sort(new String[]{"2", "3", "1", "4"}));
        assertArrayEquals(new String[]{"DOG", "Dog", "dog", "Elephant"}, selectionSorter.sort(new String[]{"Elephant", "dog", "Dog", "DOG"}));
    }
}