package com.charlottekies.algoutils.searching.divideandconquer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class BinarySearcherTest {

    private BinarySearcher binarySearcher;

    @BeforeEach
    void setUp() {
        binarySearcher = new BinarySearcher();
    }

    @Test
    void searchStrings() {
    }

    @Test
    void testSearchInts() {
        assertEquals(0, binarySearcher.search(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 1));
        assertEquals(8, binarySearcher.search(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 32));
        assertEquals(8, binarySearcher.search(new int[]{-32, -8, -8, -5, -4, -4, -2, -1, -1}, -1));
        assertEquals(-1, binarySearcher.search(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 100));
        assertEquals(-1, binarySearcher.search(new int[]{}, 5));
        assertEquals(2, binarySearcher.search(new int[]{-1, 1, 1, 2, 4, 4, 8, 8, 32}, 1));
    }

    @Test
    void testSearchIntegers() {
    }
}