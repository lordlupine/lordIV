import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArraysTest {

    MyArrays ma;

    @BeforeEach
    void setUp() {
        ma = new MyArrays();
    }

    @Test
    void binarySrch() {
        int[] x = new int[]{2, 4, 5, 10, 12, 14};
        assertEquals(true, ma.binarysSearch(x, 10));
        assertEquals(true, ma.binarysSearch(x, 14));
        assertEquals(true, ma.binarysSearch(x, 2));
        assertEquals(false, ma.binarysSearch(x, 25));
        assertEquals(true, ma.binarysSearch(x, 12));
    }

    @Test
    void removeDupsSorted() {
        int[] x = new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4};
        assertArrayEquals(new int[]{1, 2, 3, 4}, ma.removeDuplicateSorted(x));
    }

}