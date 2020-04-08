package tasks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static tasks.Task2_IntStream.findAverage;

class Task2IntStreamTest {

    @Nested
    class ReduceTests {
        @Test
        @DisplayName("Passing empty collection should return -1")
        void multiplyEmpty() {
            assertEquals(-1, Task2_IntStream.multiply(Collections.emptyList()));
        }

        @Test
        @DisplayName("Multiplication of several numbers")
        void multiplyMany() {
            assertEquals(6, Task2_IntStream.multiply(Arrays.asList(1, 2, 3)));
        }

        @Test
        @DisplayName("method should return -1 when result greater then 100")
        void multiplyResultMoreThen100() {
            assertEquals(-1, Task2_IntStream.multiply(Arrays.asList(25, 10)));
        }

        @Test
        @DisplayName("method should work as expected when result is equal to 100")
        void multiplyResultEqual100() {
            assertEquals(100, Task2_IntStream.multiply(Arrays.asList(5, 20)));
        }
    }

    @Nested
    class IntStreamTests {

        @Test
        @DisplayName("findAverage(0, 10) == 5")
        void averageOfTwo() {
            assertEquals(5, findAverage(new int[]{0, 10}));
        }

        @Test
        @DisplayName("findAverage(None) throws exception")
        void averageOfNone() {
            assertThrows(RuntimeException.class, () -> findAverage(new int[]{}));
        }
    }

}