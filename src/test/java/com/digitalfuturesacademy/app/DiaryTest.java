package com.digitalfuturesacademy.app;

import com.digitalfuturesacademy.app.Diary;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    @Nested
    @DisplayName("Engineer Constructor Tests")
    class ConstructorTests {


        @Test
        @DisplayName("Add entry check array size increases")
        void testArraySizeIncreases() {
            Diary testDiary = new Diary();
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
            Diary testDiary = new Diary();
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
            Diary testDiary = new Diary();
            String testEntry = null;
            int expected = testDiary.entries.size();
            // Arrange
            // Act
            testDiary.addEntries(testEntry);
            int actual = testDiary.entries.size();
            // Assert
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("Add whitespace entry check array size does not increase")
        void addingAWhitespaceEntry() {
            Diary testDiary = new Diary();
            String testEntry = " ";
            int expected = testDiary.entries.size();
            // Arrange
            // Act
            testDiary.addEntries(testEntry);
            int actual = testDiary.entries.size();
            // Assert
            assertEquals(expected, actual);
        }
    }
}
