package com.liamradley.javatddexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomListTest {

    @Test
    void test_noArgsConstructor_succeeds() {
        assertDoesNotThrow(() -> new CustomList<>());
    }

    @Test
    void test_isEmpty_returnsTrueWhenEmpty() {
        CustomList<String> testList = new CustomList<>();
        assertTrue(testList.isEmpty());
    }

    @Test
    void test_add_returnsTrue(){
        CustomList<String> testList = new CustomList<>();

        boolean addSucceeds = testList.add("Test String");

        assertTrue(addSucceeds);
    }

    @Test
    void test_add_multipleElementsAddedSuccessfully() {
        CustomList<String> testList = new CustomList<>();
        testList.add("TestString1");
        testList.add("TestString2");

        assertEquals(testList.size(), 2);
        assertEquals("TestString1", testList.get(0));
        assertEquals("TestString2", testList.get(1));
    }

    @Test
    void test_isEmpty_returnsFalseWhenNotEmpty() {
        CustomList<String> testList = new CustomList<>();

        testList.add("testItem");

        assertFalse(testList.isEmpty());
    }

    @Test
    void test_get_returnsCorrectItem() {
        CustomList<String> testList = new CustomList<>();
        testList.add("testItem1");
        testList.add("testItem2");
        testList.add("testItem3");

        assertEquals("testItem1", testList.get(0));
        assertEquals("testItem2", testList.get(1));
        assertEquals("testItem3", testList.get(2));
    }

    @Test
    void test_get_returnsArrayIndexOutOfBoundsException() {
        CustomList<String> testList = new CustomList<>();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> testList.get(-1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> testList.get(1));
    }
    @Test
    void test_clear_returnsEmptyArray() {
        CustomList<String> testList = new CustomList<>();
        testList.add("testItem");

        testList.clear();

        assertEquals(0, testList.size());
    }

    @Test
    void test_contains_returnsTrue() {
        CustomList<String> testList = new CustomList<>();
        testList.add("testItem1");
        testList.add("testItem2");
        testList.add("testItem3");

        assertTrue(testList.contains("testItem1"));
        assertTrue(testList.contains("testItem2"));
        assertTrue(testList.contains("testItem3"));

    }

    @Test
    void test_contains_returnsMinusOne() {
        CustomList<String> testList = new CustomList<>();
        testList.add("testItem1");
        testList.add("testItem3");

        assertTrue(testList.contains("testItem1"));
        assertFalse(testList.contains("testItem2"));
        assertTrue(testList.contains("testItem3"));
    }

    @Test
    void test_remove_removesExpectedValue() {
        CustomList<String> testList = new CustomList<>();
        testList.add("test1");
        testList.add("test2");
        testList.add("test3");

        boolean removalSuccessful = testList.remove("test2");

        assertTrue(removalSuccessful);
        assertEquals("test1", testList.get(0));
        assertEquals("test3", testList.get(1));
        assertEquals(2, testList.size());
    }

    @Test
    void test_remove_returnsFalseWhenNoSuchElementFound() {
        CustomList<String> testList = new CustomList<>();
        testList.add("test1");

        boolean removalSuccessful = testList.remove("invalid field");
        assertFalse(removalSuccessful);
        assertEquals("test1", testList.get(0));
        assertEquals(1, testList.size());
    }
}
