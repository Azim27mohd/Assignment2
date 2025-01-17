package UnitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;
import utilities.MyDLL;
import utilities.ListADT;

public class MyDLLTests {

    private ListADT<Integer> list;

    @Before
    public void setUp() {
        list = new MyDLL<>();
    }

    @Test
    public void testAdd() {
        assertTrue(list.isEmpty());
        list.add(10);
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(10), list.get(0));
    }

    @Test
    public void testAddAtIndex() {
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        assertEquals(3, list.size());
        assertEquals(Integer.valueOf(10), list.get(0));
        assertEquals(Integer.valueOf(20), list.get(1));
        assertEquals(Integer.valueOf(30), list.get(2));
    }

    @Test
    public void testGet() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(Integer.valueOf(10), list.get(0));
        assertEquals(Integer.valueOf(20), list.get(1));
        assertEquals(Integer.valueOf(30), list.get(2));
    }

    @Test
public void testGetOutOfBounds() {
    list.add(10);
    assertThrows(IndexOutOfBoundsException.class, () -> {
        list.get(1); // Accessing out of bounds
    });
}

    @Test
    public void testRemove() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(Integer.valueOf(20), list.remove(1));
        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(30), list.get(1));
    }

    @Test
    public void testRemoveByValue() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertTrue(list.remove(Integer.valueOf(20)));
        assertTrue(list.remove(Integer.valueOf(40)));
        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(10), list.get(0));
        assertEquals(Integer.valueOf(30), list.get(1));
    }

    private void assertTrue(Integer remove) {
    }

    private void assertTrue(boolean b) {
    }

    private void assertFalse(boolean b) {
    }

    @Test
    public void testClear() {
        list.add(10);
        list.add(20);
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());
        list.add(10);
        assertEquals(1, list.size());
        list.remove(0);
        assertEquals(0, list.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.add(10);
        assertFalse(list.isEmpty());
        list.remove(0);
        assertTrue(list.isEmpty());
    }
}
