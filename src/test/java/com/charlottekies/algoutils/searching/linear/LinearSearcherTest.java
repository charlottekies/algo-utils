package com.charlottekies.algoutils.searching.linear;

import com.charlottekies.algoutils.searching.divideandconquer.BinarySearcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.sound.sampled.Line;

import static org.junit.Assert.assertEquals;

class LinearSearcherTest {
    private LinearSearcher linearSearch;

    @BeforeEach
    void setUp() {
        linearSearch = new LinearSearcher();
    }

    @Test
    void testSearchStrings() {
        assertEquals(0, linearSearch.search(new String[]{"cat", "elephant", "fish", "zebra"}, "cat"));
        assertEquals(8, linearSearch.search(new String[]{"aardvark", "alligator", "animal", "beluga", "billy", "bonobo", "calf", "Cat", "cat"}, "cat"));
        assertEquals(-1, linearSearch.search(new String[]{"aardvark", "alligator", "animal", "beluga", "billy", "bonobo", "calf", "Cat", "cat"}, "fish"));
        assertEquals(-1, linearSearch.search(new String[]{}, "cat"));
        assertEquals(2, linearSearch.search(new String[]{"cat", "cat", "cat", "fish", "leopard", "whale", "zebra"}, "cat"));
    }

    @Test
    void testSearchInts() {
        assertEquals(0, linearSearch.search(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 1));
        assertEquals(8, linearSearch.search(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 32));
        assertEquals(8, linearSearch.search(new int[]{-32, -8, -8, -5, -4, -4, -2, -1, -1}, -1));
        assertEquals(-1, linearSearch.search(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 100));
        assertEquals(-1, linearSearch.search(new int[]{}, 5));
        assertEquals(2, linearSearch.search(new int[]{-1, 1, 1, 2, 4, 4, 8, 8, 32}, 1));
    }

    @Test
    void testSearchIntegers() {
        int result = linearSearch.search(new Integer[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 1);
        assertEquals(1, result);
        result =  linearSearch.search(new Integer[]{-1, 1, 2, 4, 4, 5, 8, 8, 32},32) ;
        assertEquals(8, result);
        result =  linearSearch.search(new Integer[]{-32, -8, -8, -5, -4, -4, -2, -1, -1},-1) ;
        assertEquals(8, result);
        result =  linearSearch.search(new Integer[]{-1, 1, 2, 4, 4, 5, 8, 8, 32},100) ;
        assertEquals(-1, result);
        result =  linearSearch.search(new Integer[]{},5) ;
        assertEquals(-1, result);
        result =  linearSearch.search(new Integer[]{-1, 1, 1, 2, 4, 4, 8, 8, 32},1) ;
        assertEquals(2, result);
    }
}