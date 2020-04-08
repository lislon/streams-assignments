package tasks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1BasicTest {

    @Test
    @DisplayName("Count even numbers like: 0, 2, 4, 6,")
    void countEvenNumbers() {
        assertEquals(2, Task1_Basic.countEven(Arrays.asList(0, 1, 2)));
        assertEquals(0, Task1_Basic.countEven(Arrays.asList(1, 3, 5)));
    }

    @Test
    @DisplayName("Count lowercase letters")
    void countLowercaseLetters() {
        assertEquals(0, Task1_Basic.countLowercaseLetters("ALL_CAPS"));
        assertEquals(2, Task1_Basic.countLowercaseLetters("Кот MORZE"));
    }

    @Test
    @DisplayName("Replace words on it's length")
    void highlightShortestWord() {
        assertEquals("1", Task1_Basic.replaceWordsOnLength("a"));
        assertEquals("2", Task1_Basic.replaceWordsOnLength("ab"));
        assertEquals("3", Task1_Basic.replaceWordsOnLength("abc"));
        assertEquals("1 3 1", Task1_Basic.replaceWordsOnLength("a and b"));
        assertEquals("3 6", Task1_Basic.replaceWordsOnLength("Hey  Arnold"));
    }
}
