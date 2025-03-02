package com.charlottekies.algoutils.sorting.comparison.inplace;

import org.junit.jupiter.api.AfterEach;
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
    void testStrings() {
    }
}