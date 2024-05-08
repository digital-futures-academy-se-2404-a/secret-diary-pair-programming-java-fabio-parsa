package com.digitalfuturesacademy.app;

import com.digitalfuturesacademy.app.Diary;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    @Nested
    @DisplayName("Engineer Constructor Tests")
    class ConstructorTests {
       private Diary testDiary;
        @BeforeEach
        public void setUp(){
            testDiary = new Diary();
        }

        @AfterEach
        public void tearDown(){
            testDiary = null;
        }

        @Test
        @DisplayName("Add entry check array size increases")
        void testArraySizeIncreases() {
            String testEntry = "Test Diary Entry";
            // Arrange
            int expected = testDiary.entries.size()+1;
            // Act
            testDiary.addEntries(testEntry);
            int actual = testDiary.entries.size();
            // Assert
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Add entry check array contains the actual message")
        void testArrayContainsMessage() {
            String testEntry = "Test Diary Entry";
            // Arrange
            // Act
            testDiary.addEntries(testEntry);
            boolean actual = testDiary.entries.contains(testEntry);
            // Assert
            assertTrue(actual);
        }

        @Test
        @DisplayName("Add null entry check array size does not increase")
        void addingANullEntry() {
            String testEntry = null;
            int expected = testDiary.entries.size();
            // Arrange
            // Act
            // Assert
            assertThrows(IllegalArgumentException.class, () -> testDiary.addEntries(testEntry));
        }

        @Test
        @DisplayName("Add whitespace entry check array size does not increase")
        void addingAWhitespaceEntry() {
            String testEntry = " ";
            // Arrange
            // Act

            // Assert
            assertThrows(IllegalArgumentException.class, () -> testDiary.addEntries(testEntry));
        }

        @Test
        @DisplayName("check the diary with no entries it should return an empty array")
        void testDiaryWithNoEntries() {
            ArrayList<String> expected = new ArrayList<>() ;
            // Arrange
            // Act
            ArrayList<String> actual = testDiary.getEntries();
            // Assert
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("check the diary with entries and it returns an array with those entries")
        void testDiaryWithEntries() {
            ArrayList<String> testArray = new ArrayList<>() ;
            testArray.add("Test string");
            // Arrange
            // Act
            testDiary.addEntries("Test string");
            boolean actual = testDiary.getEntries().contains("Test string");
            // Assert
            assertEquals(testArray, testDiary.getEntries());
        }

        @Test
        @DisplayName("check that pin code is the same as the one chosen")
        void testPinCodeValid() {
            // Arrange
            String testPinCode = "1234";
            // Act
            testDiary.changePin(testPinCode);
            String actual = testDiary.getPin();
            // Assert
            assertEquals(testPinCode, actual);
        }

        @Test
        @DisplayName("check that pin can't be changed to and empty string")
        void testPinCodeChangeToEmptyString() {
            // Arrange
            String testPinCode = " ";
            // Act
            // Assert
           assertThrows(IllegalArgumentException.class, () -> testDiary.changePin(testPinCode));
        }


    }
}
