package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task01StringStreamsTest {

    @Test
    void countLowercaseLetters() {
        assertEquals(0, Task01StringStreams.countLowercaseLetters("ALL_CAPS"));
        assertEquals(2, Task01StringStreams.countLowercaseLetters("Кот MORZE"));
    }

    @Test
    void highlightShortestWord() {
        assertEquals("1 3 1", Task01StringStreams.replaceWordsOnLength("a and b"));
        assertEquals("3 6", Task01StringStreams.replaceWordsOnLength("Hey  Arnold"));
    }
}
