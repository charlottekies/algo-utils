package com.charlottekies.algoutils.searching.linear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class LinearSearcherTest {
    private LinearSearcher linearSearcher;

    @BeforeEach
    void setUp() {
        linearSearcher = new LinearSearcher();
    }

    @Test
    void testSearchStrings() {
        assertEquals(0, linearSearcher.search(new String[]{"cat", "elephant", "fish", "zebra"}, "cat"));
        assertEquals(8, linearSearcher.search(new String[]{"aardvark", "alligator", "animal", "beluga", "billy", "bonobo", "calf", "Cat", "cat"}, "cat"));
        assertEquals(-1, linearSearcher.search(new String[]{"aardvark", "alligator", "animal", "beluga", "billy", "bonobo", "calf", "Cat", "cat"}, "fish"));
        assertEquals(-1, linearSearcher.search(new String[]{}, "cat"));
        assertEquals(0, linearSearcher.search(new String[]{"cat", "cat", "cat", "fish", "leopard", "whale", "zebra"}, "cat"));
    }

    @Test
    void testSearchInts() {
        assertEquals(1, linearSearcher.search(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 1));
        assertEquals(8, linearSearcher.search(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 32));
        assertEquals(7, linearSearcher.search(new int[]{-32, -8, -8, -5, -4, -4, -2, -1, -1}, -1));
        assertEquals(-1, linearSearcher.search(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 100));
        assertEquals(-1, linearSearcher.search(new int[]{}, 5));
        assertEquals(1, linearSearcher.search(new int[]{-1, 1, 1, 2, 4, 4, 8, 8, 32}, 1));
    }

    @Test
    void testSearchIntegers() {
        int result = linearSearcher.search(new Integer[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 1);
        assertEquals(1, result);
        result =  linearSearcher.search(new Integer[]{-1, 1, 2, 4, 4, 5, 8, 8, 32},32) ;
        assertEquals(8, result);
        result =  linearSearcher.search(new Integer[]{-32, -8, -8, -5, -4, -4, -2, -1, -1},-1) ;
        assertEquals(7, result);
        result =  linearSearcher.search(new Integer[]{-1, 1, 2, 4, 4, 5, 8, 8, 32},100) ;
        assertEquals(-1, result);
        result =  linearSearcher.search(new Integer[]{},5) ;
        assertEquals(-1, result);
        result =  linearSearcher.search(new Integer[]{-1, 1, 1, 2, 4, 4, 8, 8, 32},1) ;
        assertEquals(1, result);
    }


    @Test
    void testIncludesString() {
        assertEquals(true, linearSearcher.includes(new String[]{"cat", "elephant", "fish", "zebra"}, "cat"));
        assertEquals(true, linearSearcher.includes(new String[]{"aardvark", "alligator", "animal", "beluga", "billy", "bonobo", "calf", "Cat", "cat"}, "cat"));
        assertEquals(false, linearSearcher.includes(new String[]{"aardvark", "alligator", "animal", "beluga", "billy", "bonobo", "calf", "Cat", "cat"}, "fish"));
        assertEquals(false, linearSearcher.includes(new String[]{}, "cat"));
        assertEquals(true, linearSearcher.includes(new String[]{"1cat", "cat", "cat", "fish", "leopard", "whale", "zebra"}, "cat"));
        assertEquals(false, linearSearcher.includes(new String[]{"cat", "cat", "cat", "fish", "leopard", "whale", "zebra"}, ""));
    }

    @Test
    void testIncludesInt() {
        assertEquals(true, linearSearcher.includes(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 1));
        assertEquals(true, linearSearcher.includes(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 32));
        assertEquals(true, linearSearcher.includes(new int[]{-32, -8, -8, -5, -4, -4, -2, -1, -1}, -1));
        assertEquals(false, linearSearcher.includes(new int[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 100));
        assertEquals(false, linearSearcher.includes(new int[]{}, 5));
        assertEquals(true, linearSearcher.includes(new int[]{-1, 1, 1, 2, 4, 4, 8, 8, 32}, 1));
    }

    @Test
    void testIncludesInteger() {
        boolean result = linearSearcher.includes(new Integer[]{-1, 1, 2, 4, 4, 5, 8, 8, 32}, 1);
        assertEquals(true, result);
        result =  linearSearcher.includes(new Integer[]{-1, 1, 2, 4, 4, 5, 8, 8, 32},32) ;
        assertEquals(true, result);
        result =  linearSearcher.includes(new Integer[]{-32, -8, -8, -5, -4, -4, -2, -1, -1},-1) ;
        assertEquals(true, result);
        result =  linearSearcher.includes(new Integer[]{-1, 1, 2, 4, 4, 5, 8, 8, 32},100) ;
        assertEquals(false, result);
        result =  linearSearcher.includes(new Integer[]{},5) ;
        assertEquals(false, result);
        result =  linearSearcher.includes(new Integer[]{-1, 1, 1, 2, 4, 4, 8, 8, 32},1) ;
        assertEquals(true, result);
    }
}