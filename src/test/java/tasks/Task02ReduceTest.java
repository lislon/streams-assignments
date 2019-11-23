package tasks;

import org.junit.jupiter.api.Test;
import tasks.Task02Reduce;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Task02ReduceTest {

    @Test
    void multiplyMe() {
        assertEquals(6, Task02Reduce.multiply(Arrays.asList(1, 2, 3)));
        assertEquals(-1, Task02Reduce.multiply(Collections.emptyList()));
        assertEquals(-1, Task02Reduce.multiply(Arrays.asList(25, 10)));
    }
}