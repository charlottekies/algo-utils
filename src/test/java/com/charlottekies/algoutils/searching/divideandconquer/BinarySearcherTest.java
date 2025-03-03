package com.charlottekies.algoutils.searching.divideandconquer;

import com.charlottekies.algoutils.sorting.comparison.inplace.BubbleSorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class BinarySearcherTest {

    private BinarySearcher binarySearcher;
    private BubbleSorter bubbleSorter;

    @BeforeEach
    void setUp() {
        this.bubbleSorter = new BubbleSorter();
        binarySearcher = new BinarySearcher(bubbleSorter);
    }

    @Test
    void testSearchStrings() {
        assertEquals(0, binarySearcher.search(new String[]{"cat", "elephant", "fish", "zebra"}, "cat"));
        assertEquals(8, binarySearcher.search(new String[]{"aardvark", "alligator", "animal", "beluga", "billy", "bonobo", "calf", "Cat", "cat"}, "cat"));
        assertEquals(-1, binarySearcher.search(new String[]{"aardvark", "alligator", "animal", "beluga", "billy", "bonobo", "calf", "Cat", "cat"}, "fish"));
        assertEquals(-1, binarySearcher.search(new String[]{}, "cat"));
        assertEquals(2, binarySearcher.search(new String[]{"cat", "cat", "cat", "fish", "leopard", "whale", "zebra"}, "cat"));
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
        int result = binarySearcher.search(new Integer[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 1);
        assertEquals(1, result);
        result =  binarySearcher.search(new Integer[]{-1, 1, 2, 4, 4, 5, 8, 8, 32},32) ;
        assertEquals(8, result);
        result =  binarySearcher.search(new Integer[]{-32, -8, -8, -5, -4, -4, -2, -1, -1},-1) ;
        assertEquals(8, result);
        result =  binarySearcher.search(new Integer[]{-1, 1, 2, 4, 4, 5, 8, 8, 32},100) ;
        assertEquals(-1, result);
        result =  binarySearcher.search(new Integer[]{},5) ;
        assertEquals(-1, result);
        result =  binarySearcher.search(new Integer[]{-1, 1, 1, 2, 4, 4, 8, 8, 32},1) ;
        assertEquals(2, result);
    }

    @Test
    void testIncludesString() {
        assertEquals(true, binarySearcher.includes(new String[]{"cat", "elephant", "fish", "zebra"}, "cat"));
        assertEquals(true, binarySearcher.includes(new String[]{"aardvark", "alligator", "animal", "beluga", "billy", "bonobo", "calf", "Cat", "cat"}, "cat"));
        assertEquals(false, binarySearcher.includes(new String[]{"aardvark", "alligator", "animal", "beluga", "billy", "bonobo", "calf", "Cat", "cat"}, "fish"));
        assertEquals(false, binarySearcher.includes(new String[]{}, "cat"));
        assertEquals(true, binarySearcher.includes(new String[]{"cat", "cat", "cat", "fish", "while", "leopard", "zebra"}, "cat"));
        assertEquals(false, binarySearcher.includes(new String[]{"cat", "cat", "cat", "fish", "leopard", "whale", "zebra"}, ""));
    }

    @Test
    void testIncludesInt() {
        assertEquals(true, binarySearcher.includes(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 1));
        assertEquals(true, binarySearcher.includes(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 32));
        assertEquals(true, binarySearcher.includes(new int[]{-32, -8, -8, -5, -4, -4, -2, -1, -1}, -1));
        assertEquals(false, binarySearcher.includes(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 100));
        assertEquals(false, binarySearcher.includes(new int[]{}, 5));
        assertEquals(true, binarySearcher.includes(new int[]{-1, 1, 1, 2, 4, 4, 8, 8, 32}, 1));
    }

    @Test
    void testIncludesInteger() {
        boolean result = binarySearcher.includes(new Integer[]{-1, 4, 4, 2, 1, 5, 8, 8, 32}, 1);
        assertEquals(true, result);
        result =  binarySearcher.includes(new Integer[]{-1, 1, 2, 8, 4, 5, 4, 8, 32},32) ;
        assertEquals(true, result);
        result =  binarySearcher.includes(new Integer[]{-32, -8, -8, -5, -4, -4, -2, -1, -1},-1) ;
        assertEquals(true, result);
        result =  binarySearcher.includes(new Integer[]{-1, 1, 2, 4, 4, 5, 8, 8, 32},100) ;
        assertEquals(false, result);
        result =  binarySearcher.includes(new Integer[]{},5) ;
        assertEquals(false, result);
        result =  binarySearcher.includes(new Integer[]{-1, 1, 1, 2, 4, 4, 8, 8, 32},1) ;
        assertEquals(true, result);
    }
}