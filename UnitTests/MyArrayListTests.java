package UnitTests;

import utilities.MyArrayList;
import utilities.ListADT;

public class MyArrayListTests {

    private ListADT<Integer> list;

    @Before
    public void setUp() {
        list = new MyArrayList<>();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd() {
        assertTrue(list.isEmpty());
        list.add(10);
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(10), list.get(0));
    }

    private void assertEquals(int i, int size) {
		// TODO Auto-generated method stub
		
	}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAtIndex() {
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        assertEquals(3, list.size());
        assertEquals(Integer.valueOf(10), list.get(0));
        assertEquals(Integer.valueOf(20), list.get(1));
        assertEquals(Integer.valueOf(30), list.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(Integer.valueOf(10), list.get(0));
        assertEquals(Integer.valueOf(20), list.get(1));
        assertEquals(Integer.valueOf(30), list.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        list.add(10);
        list.get(1); // Accessing out of bounds
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(Integer.valueOf(20), list.remove(1));
        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(30), list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveByValue() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertTrue(list.remove(Integer.valueOf(20)));
        assertFalse(list.remove(Integer.valueOf(40)));
        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(10), list.get(0));
        assertEquals(Integer.valueOf(30), list.get(1));
    }

    private void assertFalse(Integer remove) {
    }

    private void assertTrue(Integer remove) {
    }

    private void assertFalse(boolean b) {
    }

    private void assertTrue(boolean b) {
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testClear() {
        list.add(10);
        list.add(20);
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSize() {
        assertEquals(0, list.size());
        list.add(10);
        assertEquals(1, list.size());
    }
}
    
